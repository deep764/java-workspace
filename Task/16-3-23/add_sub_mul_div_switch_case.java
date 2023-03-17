package com.d16;

import java.util.Scanner;

public class add_sub_mul_div_switch_case 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.print("Enter the choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the First number:");
			int a=sc.nextInt();
			System.out.println("Enter the Second number:");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("Addition="+c);
			break;
		case 2:
			System.out.println("Enter the First number:");
			int d=sc.nextInt();
			System.out.println("Enter the Second number:");
			int f=sc.nextInt();
			int e=d-f;
			System.out.println("Subtraction="+e);
			break;
		case 3:
			System.out.println("Enter the First number:");
			int x=sc.nextInt();
			System.out.println("Enter the Second number:");
			int y=sc.nextInt();
			int z=x*y;
			System.out.println("Multiplication="+z);
			break;
		case 4:
			System.out.println("Enter the First number:");
			int m=sc.nextInt();
			System.out.println("Enter the Second number:");
			int n=sc.nextInt();
			int o=m/n;
			System.out.println("Division="+o);
			break;
		default:
			System.out.println("Invalid Choice\n");
			break;
		}
	}
}
