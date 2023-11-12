package Generics;

public class Different {

    public static <T> void performAction(T value) {
        if (value instanceof String) {
            System.out.println("Performing String action: " + value);
        } else if (value instanceof Boolean) {
            System.out.println("Performing Boolean action: " + value);
        } else {
            System.out.println("Performing default action: " + value);
        }
    }

    public static void main(String[] args) {
        // Example with String
        performAction("Hello, World!");

        // Example with Boolean
        performAction(true);

        // Example with Integer (default action)
        performAction(42);
    }
}

