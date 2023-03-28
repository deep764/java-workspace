package Module_1;

import java.util.Scanner;

public class Spread 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = scanner.nextLine();
        scanner.close();
        int letters=0;
        int spaces=0;
        int numbers=0;
        int special=0;
        for (int i = 0; i < input.length(); i++) 
        {
            char c = input.charAt(i);
            if (Character.isLetter(c)) 
            {
                letters++;
            } 
            else if (Character.isDigit(c)) 
            {
                numbers++;
            } 
            else if (Character.isWhitespace(c)) 
            {
                spaces++;
            } 
            else 
            {
                special++;
            }
        }
        System.out.println("Number of letters:"+letters);
        System.out.println("Number of spaces:"+spaces);
        System.out.println("Number of numbers:"+numbers);
        System.out.println("Number of special characters:"+special);
	}
}
