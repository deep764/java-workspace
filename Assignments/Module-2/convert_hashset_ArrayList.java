package Module_2;

import java.util.*;


public class convert_hashset_ArrayList 
{
	 public static void main(String[] args) 
	 {
	        // Create a HashSet
	        Set<String> hashSet = new HashSet<>();
	        hashSet.add("element1");
	        hashSet.add("element2");
	        hashSet.add("element3");
	        hashSet.add("element4");
	        hashSet.add("element5");
	        hashSet.add("element6");
	        hashSet.add("element7");
	        hashSet.add("element8");
	        
	        

	        // Convert the HashSet to an ArrayList
	        List<String> arrayList = new ArrayList<>(hashSet);

	        // Print the ArrayList
	        System.out.println("ArrayList elements:");
	        for (String element : arrayList) 
	        {
	            System.out.println(element);
	        }
	    }
}
