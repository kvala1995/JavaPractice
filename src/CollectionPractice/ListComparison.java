package CollectionPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> li = new ArrayList<>(List.of(11,2,3,4,34,56,12,78,90));
        
        int min = Collections.min(li);
        int max = Collections.max(li);
        
        if(min ==max) {
        	System.out.println("All the items are equal");
        }else {
        	System.out.println("The max element of list is "+ max);
        	System.out.println("The min element of list is "+ min);
        }
        
	}

}
