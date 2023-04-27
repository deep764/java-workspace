package Module_2;

import java.util.Arrays;

public class UpdateArrayElement 
{
	 public static void main(String[] args) 
	 {
	        // Define the array
	        String[] fruits = {"Apple", "Banana", "Cherry", "Date"};

	        // Print the original array
	        System.out.println("Original array: " + Arrays.toString(fruits));

	        // Update the third element (index 2) with "Grape"
	        fruits[2] = "Grape";

	        // Print the updated array
	        System.out.println("Updated specific array: " + Arrays.toString(fruits));
	    }
}
