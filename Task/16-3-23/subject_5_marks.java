package com.d16;

import java.util.Scanner;

public class subject_5_marks 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Maths marks:");
		int m=sc.nextInt();
		System.out.print("Enter English marks:");
		int e=sc.nextInt();
		System.out.print("Enter Hindi marks:");
		int h=sc.nextInt();
		System.out.print("Enter Gujarati marks:");
		int g=sc.nextInt();
		System.out.print("Enter Science marks:");
		int s=sc.nextInt();
		int total=m+e+h+g+s;
		float per=total/5;
		if(e>=33&&s>=33&&m>=33&&g>=33&&h>=33)
		{
			System.out.println("Total marks:"+total);
			System.out.println("Total percentage:"+per);
			if(per>75)
			{
				System.out.println("Distinction");
			}
			else if((per>60) && (per<=75))
			{
				System.out.println("First class");
			}
			else if((per>50) && (per<=60))
			{
				System.out.println("Second class");
			}
			else if((per>35) && (per<=50))
			{
				System.out.println("Pass class");
			}
		}
		else
		{
			System.out.println("Fail");
		}
		
	}
}
