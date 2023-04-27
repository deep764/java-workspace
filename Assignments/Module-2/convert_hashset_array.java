package Module_2;

import java.util.*;

public class convert_hashset_array 
{
	  public static void main(String[] args) 
	  {
	        // Create a HashSet
	        Set<String> hashSet = new HashSet<>();
	        hashSet.add("element1");
	        hashSet.add("element2");
	        hashSet.add("element3");

	        // Convert the HashSet to an array
	        String[] array = hashSet.toArray(new String[0]);

	        // Print the array
	        System.out.println("Array elements:");
	        for (String element : array) 
	        {
	            System.out.println(element);
	        }
	    }
}
