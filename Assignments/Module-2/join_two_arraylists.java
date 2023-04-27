package Module_2;

import java.util.*;

public class join_two_arraylists 
{
	 public static void main(String[] args) {
	        // Create the first ArrayList
	        List<String> arrayList1 = new ArrayList<>();
	        arrayList1.add("element1");
	        arrayList1.add("element2");

	        // Create the second ArrayList
	        List<String> arrayList2 = new ArrayList<>();
	        arrayList2.add("element3");
	        arrayList2.add("element4");

	        // Join the two ArrayLists
	        List<String> joinedList = new ArrayList<>(arrayList1);
	        joinedList.addAll(arrayList2);

	        // Print the joined ArrayList
	        System.out.println("Joined ArrayList elements:");
	        for (String element : joinedList) {
	            System.out.println(element);
	        }
	    }
}
