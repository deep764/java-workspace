package Module_2;

import java.util.HashSet;

public class elements_hashset 
{
	 public static void main(String[] args) {
	        // Create a new HashSet
	        HashSet<String> set = new HashSet<>();

	        // Add some elements to the set
	        set.add("element 1");
	        set.add("element 2");
	        set.add("element 3");

	        // Get the number of elements in the set
	        int size = set.size();

	        // Print the number of elements
	        System.out.println("The set contains " + size + " elements.");
	    }
}
