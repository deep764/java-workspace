package com.d16;

import java.util.Scanner;

public class prime_or_not_prime 
{
	public static void main(String[] args) 
	{
		int i,c=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your number:");
		int number =sc.nextInt();
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				c++;	
			}
		}
			if(c==2)
			{
				System.out.println("Prime number");
			}
			else
			{
				System.out.println("Not prime number");
			}
	}
}
