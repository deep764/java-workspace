package Module_2;

import java.util.*;

public class compare_two_sets 
{
	public static void main(String[] args) 
	{
        // Create the first set
        Set<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Create the second set
        Set<Integer> set2 = new HashSet<Integer>();
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Use the retainAll() method to find the intersection of the sets
        set1.retainAll(set2);

        // Print the intersection of the sets
        System.out.println("Intersection of the sets: " + set1);
    }
}
