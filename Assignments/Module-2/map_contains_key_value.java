package Module_2;

import java.util.*;

public class map_contains_key_value 
{
	public static void main(String[] args) {
        // Create a Map with some key-value mappings
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        //map.put("key2", "value2");

        // Check if the Map contains any key-value mappings
        if (map.isEmpty()) {
            System.out.println("The Map is empty.");
        } else {
            System.out.println("The Map is not empty.");
        }
    }
}
