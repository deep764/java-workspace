package Module_1;

import java.util.Scanner;

public class ASCII_value 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a character: ");
	        char c = scanner.next().charAt(0);
	        scanner.close();
	        int asciiValue = (int) c;
	        System.out.println("The ASCII value of:" + c + " is " + asciiValue);
	}
}
