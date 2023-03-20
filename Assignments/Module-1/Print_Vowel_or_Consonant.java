package Module_1;

import java. util.Scanner;

public class Print_Vowel_or_Consonant 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the alphabet:");
        String input = scanner.nextLine();

        if (input.length()!=1) 
        {
            System.out.println("Error: Please enter only one alphabet.");
        } 
        else 
        {
            char ch = input.charAt(0);
            if (ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') 
            {
                if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') 
                {
                    System.out.println("Vowel");
                } 
                else 
                {
                    System.out.println("Consonant");
                }
            } 
            else 
            {
                System.err.println("Error: Please enter the only alphabet.");
            }
        }
	}
}

