package Module_2;

import java.util.ArrayList;

public class RetrieveElement 
{
    public static void main(String[] args) 
    {
        // Create the ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");

        // Retrieve the element at index 2
        String element = list.get(2);

        // Print the retrieved element
        System.out.println("Element at index 2: " + element);
    }
}







