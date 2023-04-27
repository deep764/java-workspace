package Module_2;

import java.util.ArrayList;

public class position_element_arraylist 
{
	public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<String>();

        // Add some elements to the list
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");

        // Print the elements using the position of the elements
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at position " + i + " is " + list.get(i));
        }
    }
}
