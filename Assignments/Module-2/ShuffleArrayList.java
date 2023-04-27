package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        System.out.println("Original list: " + list);
        
        Collections.shuffle(list);
        
        System.out.println("Shuffled list: " + list);
    }
}