import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // nextInt() usage
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("You entered an integer: " + intValue);

        // nextDouble() usage
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("You entered a double: " + doubleValue);

        // nextLine() usage (to consume the newline character)
        scanner.nextLine();

        // next() usage
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered a word: " + word);

        // nextBoolean() usage
        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = scanner.nextBoolean();
        System.out.println("You entered a boolean: " + boolValue);

        // nextByte() usage
        System.out.print("Enter a byte: ");
        byte byteValue = scanner.nextByte();
        System.out.println("You entered a byte: " + byteValue);

        // nextShort() usage
        System.out.print("Enter a short: ");
        short shortValue = scanner.nextShort();
        System.out.println("You entered a short: " + shortValue);

        // nextLong() usage
        System.out.print("Enter a long: ");
        long longValue = scanner.nextLong();
        System.out.println("You entered a long: " + longValue);

        // nextFloat() usage
        System.out.print("Enter a float: ");
        float floatValue = scanner.nextFloat();
        System.out.println("You entered a float: " + floatValue);

        scanner.close();
    }
}
