import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Using ternary operator to determine if the user is eligible to vote
        String voteStatus = (age >= 18) ? "eligible" : "not eligible";
        System.out.println("You are " + voteStatus + " to vote.");

        // Asking the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Using ternary operator to determine if the number is positive or negative
        String numberStatus = (number >= 0) ? "positive" : "negative";
        System.out.println("The number is " + numberStatus + ".");

        // Asking the user to enter a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);

        // Using ternary operator to determine if the character is a vowel or consonant
        String charType = (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') ?
                "vowel" : "consonant";
        System.out.println("The character is a " + charType + ".");

        scanner.close();
    }
}
