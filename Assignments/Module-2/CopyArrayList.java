package Module_2;

import java.util.ArrayList;

public class CopyArrayList 
{
	  public static void main(String[] args) 
	  {
	        ArrayList<Integer> list1 = new ArrayList<Integer>();
	        list1.add(1);
	        list1.add(2);
	        list1.add(3);
	        list1.add(4);
	        list1.add(5);
	        
	        ArrayList<Integer> list2 = new ArrayList<Integer>();
	        list2.addAll(list1);
	        
	        System.out.println("List 1: " + list1);
	        System.out.println("List 2: " + list2);
	    }
}
