import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Checking if the user is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }

        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Checking if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Checking if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }

        // Asking the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Checking if the character is a vowel or consonant
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
            System.out.println("The character is a vowel.");
        } else {
            System.out.println("The character is a consonant.");
        }

        scanner.close();
    }
}
