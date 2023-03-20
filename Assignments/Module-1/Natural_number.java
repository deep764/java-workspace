package Module_1;

import java.util.Scanner;

public class Natural_number 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		{
			int k=0;
			System.out.print("Enter the natural number:");
			int n=sc.nextInt();
			for(int i=1;i<=n;i++)
			{
				k=k+i;
			}
			System.out.println("Ans="+k);
		}			
	}
}
