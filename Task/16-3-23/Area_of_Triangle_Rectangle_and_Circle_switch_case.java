package com.d16;

import java. util.Scanner;

public class Area_of_Triangle_Rectangle_and_Circle_switch_case 
{
	 public static void main(String[] args) 
	 {
		Scanner sc = new Scanner(System.in);
        System.out.println("1. Triangle");
	    System.out.println("2. Rectangle");
	    System.out.println("3. Circle");
	    System.out.print("Enter your choice:");
	    int choice = sc.nextInt();
	        double area = 0.0;
	        if (choice == 1) 
	        {
	            System.out.print("Enter the base of the triangle: ");
	            double base = sc.nextDouble();
	            System.out.print("Enter the height of the triangle: ");
	            double height = sc.nextDouble();
	            area =  (0.5 * base * height);
	        } 
	        else if (choice == 2) 
	        {
	            System.out.print("Enter the width of the rectangle: ");
	            double width = sc.nextDouble();
	            System.out.print("Enter the height of the rectangle: ");
	            double height = sc.nextDouble();
	            area =width * height;
	        } 
	        else if (choice == 3) 
	        {
	            System.out.print("Enter the radius of the circle: ");
	            double radius = sc.nextDouble();
	            area =3.14 * radius * radius;
	        } 
	        else 
	        {
	            System.out.println("Invalid choice.");
	            System.exit(0);
	        }
	        System.out.println("The area is: " + area);
	    }
}
