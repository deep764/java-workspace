package Module_2;

import java.util.ArrayList;

public class SearchArrayList 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        int searchElement = 3;
        int index = list.indexOf(searchElement);
        
        if (index == -1) 
        {
            System.out.println("Element not found");
        } 
        else 
        {
            System.out.println("Element found at index " + index);
        }
    }
}