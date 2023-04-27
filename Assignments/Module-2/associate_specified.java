package Module_2;

import java.util.HashMap;

public class associate_specified 
{
	 public static void main(String[] args) 
	 {
	        // Create a new HashMap
	        HashMap<String, Integer> map = new HashMap<>();

	        // Add a key-value pair to the map
	        String key = "myKey";
	        Integer value = 42;
	        map.put(key, value);

	        // Retrieve the value associated with the key
	        Integer retrievedValue = map.get(key);

	        // Print the retrieved value
	        System.out.println("Retrieved value: " + retrievedValue);
	    }
}
