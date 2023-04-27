package Module_2;

import java.util.*;

public class swap_two_elements_arraylist 
{
	  public static void main(String[] args) 
	  {
	        // Create an ArrayList
	        List<String> arrayList = new ArrayList<>();
	        arrayList.add("element1");
	        arrayList.add("element2");
	        arrayList.add("element3");
	        arrayList.add("element4");

	        // Print the original ArrayList
	        System.out.println("Original ArrayList elements:");
	        for (String element : arrayList) 
	        {
	            System.out.println(element);
	        }

	        // Swap the second and third elements
	        int index1 = 1;
	        int index2 = 2;
	        String temp = arrayList.get(index1);
	        arrayList.set(index1, arrayList.get(index2));
	        arrayList.set(index2, temp);

	        // Print the swapped ArrayList
	        System.out.println("Swapped ArrayList elements:");
	        for (String element : arrayList) 
	        {
	            System.out.println(element);
	        }
	    }
}
