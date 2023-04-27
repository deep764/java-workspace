package Module_2;

import java.util.HashMap;
import java.util.Map;

public class count_number_key_value_map 
{
	  public static void main(String[] args) {
	        // Create a new HashMap object
	        Map<String, Integer> map = new HashMap<>();

	        // Add some key-value pairs to the map
	        map.put("apple", 3);
	        map.put("banana", 2);
	        map.put("orange", 4);
	        map.put("grape", 1);
	        map.put("Sapodilla", 5);
	        

	        // Get the number of key-value mappings in the map
	        int size = map.size();

	        // Print the number of key-value mappings
	        System.out.println("Size of the map: " + size);
	    }
}
