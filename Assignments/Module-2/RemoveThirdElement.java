package Module_2;

import java.util.ArrayList;

public class RemoveThirdElement 
{
	 public static void main(String[] args) 
	 {
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Print the original list
	        System.out.println("Original list: " + list);

	        // Remove the third element (index 2)
	        list.remove(2);

	        // Print the updated list
	        System.out.println("Remove list: " + list);
	    }
}
