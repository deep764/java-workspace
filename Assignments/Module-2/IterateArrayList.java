package Module_2;

import java.util.ArrayList;

public class IterateArrayList 
{
	 public static void main(String[] args) 
	 {
	        // Create the ArrayList
	        ArrayList<String> list = new ArrayList<String>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Date");

	        // Iterate through the ArrayList using a for loop
	        for (int i = 0; i < list.size(); i++) 
	        {
	            String element = list.get(i);
	            System.out.println(element);
	        }

	        // Alternatively, iterate through the ArrayList using a for-each loop
	        for (String element : list) 
	        {
	            System.out.println(element);
	        }
	    }
}
