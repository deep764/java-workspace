package com.d16;

import java.util.Scanner;

public class leap_year_or_not 
{
	public static void main(String[] args) 
	{
		int year=0;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter your number:");
		int number =sc.nextInt();
		if(year%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not leap year");
		}
	}
}
