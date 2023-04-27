package Module_2;

import java.util.ArrayList;

public class InsertElement_Arraylist 
{
	public static void main(String[] args) 
	{
        // Create the ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Insert "Apple" at the first position (index 0)
        list.add(0, "Apple");

        // Print the updated ArrayList
        System.out.println("Updated list: " + list);
    }
}
