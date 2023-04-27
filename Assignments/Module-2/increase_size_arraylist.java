package Module_2;

import java.util.ArrayList;

public class increase_size_arraylist 
{
	 public static void main(String[] args) {
	        // Create an ArrayList with initial capacity
	        ArrayList<String> list = new ArrayList<String>(5);

	        // Add some elements to the list
	        list.add("Element 4");
	        list.add("Element 5");
	        list.add("Element 6");
	        list.add("Element 7");

	        // Increase the size of the list
	        list.ensureCapacity(10);

	        // Print the updated size of the list
	        System.out.println("New size of ArrayList: " + list.size());
	    }
}
