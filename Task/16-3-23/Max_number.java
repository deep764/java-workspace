package com.d16;

import java.util.Scanner;

public class Max_number 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the First number:");
		int f =sc.nextInt();
		System.out.print("Enter the Second number:");
		int s =sc.nextInt();
		System.out.print("Enter the Third number:");
		int t =sc.nextInt();
		if(f>s)
		{
			if(f>t)
			{
				System.out.println("First greater number");
			}
		}
		if(s>f)
		{
			if(s>t)
			{
				System.out.println("Second greater number");
			}
		}
		if(t>f)
		{
			if(t>s)
			{
				System.out.println("Third greater number");
			}
		}
	}
}
