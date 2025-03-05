package CollectionPractice;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ReadOnlySets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          //make read only set
		  Integer[] First_10 = {1,2,3,4,5,6,7,8,9,10};
		  
		  //this line does not give array elements instead 'll give address of an array
		  System.out.println(First_10);
		
		  Set<Integer> s1 = new HashSet<>();
		  
		  //adding 10 numbers to set
		  Collections.addAll(s1, First_10);
		  
		  s1.remove(4);
		  System.out.println(s1);
		  
		  s1 = Collections.unmodifiableSet(s1);
		  
		  try {
			  s1.remove(1);
		  }catch(UnsupportedOperationException e) {
			  System.out.println(e.toString());
		  }
		  
	}

}
