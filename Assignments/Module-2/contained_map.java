package Module_2;

import java.util.*;

public class contained_map 
{
    public static void main(String[] args) 
    {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<Integer, String>();

        // Add some key-value pairs
        map.put(1, "Value 1");
        map.put(2, "Value 2");
        map.put(3, "Value 3");

        // Get a collection view of the values
        Collection<String> values = map.values();

        // Print the values
        for (String value : values) {
            System.out.println(value);
        }
    }

}
