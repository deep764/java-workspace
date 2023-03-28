package Module_1;

public class divisible_3_5_both 
{
	public static void main(String[] args) 
	{
		//This program used by for loop and if condition
		//Divided by 3
		System.out.println("Divided by 3:");		
		for (int i=1; i<100; i++) 
		{
			if (i%3==0) 
			System.out.print(i +",");			
		}			
		//Divided by 5	
		System.out.println("\nDivided by 5:");
		for (int i=1; i<100; i++) 
		{
			if (i%5==0) System.out.print(i+",");			
		}
		//Divided by 3 and 5
		System.out.println("\nDivided by 3 & 5:");			
		for (int i=1; i<100; i++) 
		{
			if (i%3==0 && i%5==0) System.out.print(i+",");			
		}
		System.out.println("\n");
	}
}

