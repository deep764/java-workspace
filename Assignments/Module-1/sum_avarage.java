package Module_1;

import java.util.Scanner;

public class sum_avarage 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i,s=0,m=0;
		double avg;
		{
			System.out.println("Enter Any 5 Number:");
		}
		for(i=0;i<5;i++)
		{
			s = sc.nextInt();
			m +=s;
		}
		avg=m/5;
	System.out.println("The sum of 5 no is : " +m+"\nThe Average is : " +avg);
		
		
	}
}
