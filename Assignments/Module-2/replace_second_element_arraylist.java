package Module_2;

import java.util.ArrayList;

public class replace_second_element_arraylist 
{
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> list = new ArrayList<String>();

	        // Add some elements to the list
	        list.add("Element 1");
	        list.add("Element 2");
	        list.add("Element 3");

	        // Replace the second element with a new element
	        String newElement = "New Element";
	        list.set(1, newElement);

	        // Print the updated list
	        System.out.println("Updated ArrayList: " + list);
	    }
}
