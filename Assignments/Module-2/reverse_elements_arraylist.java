package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class reverse_elements_arraylist 
{
	 public static void main(String[] args) 
	 {
	        ArrayList<Integer> originalList = new ArrayList<Integer>();

	        // Add some elements to the original list
	        originalList.add(10);
	        originalList.add(20);
	        originalList.add(30);
	        originalList.add(40);
	        originalList.add(50);

	        // Reverse the elements in the original list
	        Collections.reverse(originalList);

	        // Print the reversed list
	        System.out.println("Reversed list: " + originalList);
	    }
}
