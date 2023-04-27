package Module_2;
import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
            System.out.println("Welcome to vote!");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        }
    }
}

