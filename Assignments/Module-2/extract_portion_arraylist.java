package Module_2;

import java.util.ArrayList;

public class extract_portion_arraylist 
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

	        // Extract a portion of the original list
	        ArrayList<Integer> extractedList = new ArrayList<Integer>(originalList.subList(1, 4));

	        // Print the original and extracted lists
	        System.out.println("Original list: " + originalList);
	        System.out.println("Extracted list: " + extractedList);
	    }
}
