package Module_2;

import java.util.ArrayList;

public class compare_two_arraylists 
{	
	 public static void main(String[] args) {
	        ArrayList<Integer> list1 = new ArrayList<>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);

	        ArrayList<Integer> list2 = new ArrayList<>();
	        list2.add(1);
	        list2.add(2);
	        list2.add(4);

	        boolean isEqual = list1.equals(list2);

	        if (isEqual) {
	            System.out.println("The two ArrayLists are equal.");
	        } else {
	            System.out.println("The two ArrayLists are not equal.");
	        }
	    }
}
