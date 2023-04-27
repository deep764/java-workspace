package Module_2;

import java.util.HashSet;

public class iterate_through_hashlist 
{
	 public static void main(String[] args) {
	        // Create a new HashSet
	        HashSet<String> set = new HashSet<>();

	        // Add some elements to the set
	        set.add("element 1");
	        set.add("element 2");
	        set.add("element 3");

	        // Iterate through all the elements in the set
	        for (String element : set) {
	            System.out.println(element);
	        }
	    }
}
