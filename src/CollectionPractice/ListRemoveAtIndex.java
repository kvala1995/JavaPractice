package CollectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ListRemoveAtIndex {

	@SuppressWarnings("removal")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "11098765";
        List<Integer> li = new ArrayList<>();
        
        char[] chr = str.toCharArray();
        
        
        for(char i : chr) {
        	li.add(Character.getNumericValue(i));
        }
        
        System.out.println(li);
        
        //remove at index 1
       li.remove(1);
        
        //remove an object
        li.remove(new Integer(6));
        
        System.out.println(li);
        
        
        
        
        
        
        
       
	}

}
