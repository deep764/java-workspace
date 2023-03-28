package Module_1;

import java.util.Scanner;

public class Count_number 
{
	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Input an integer number less than ten billion:");
	        long num = sc.nextLong();
	        int count = 0;
	        
	        // Count the number of digits in the number
	        while(num > 0) 
	        {
	            num /= 10;
	            count++;
	        }
	        System.out.println("Number of digits in the number:"+count);
	}
}
