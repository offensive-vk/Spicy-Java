package Generics;
/**
 * Default Class for Execution
 * @author Vedansh
 * @category final
 */
public final class Different {
    final static int DEFAULT = 100;
    public static <T> void performAction(final T value) {

        if (value instanceof String) {
            System.out.println("Found String Type: " + value);
        } else if (value instanceof Boolean) {
            System.out.println("Found Boolean Type: " + value);
        } else if (value instanceof Different) {
            System.out.println("Found Different Type: " + value);
        } else {
            System.out.println("Default / Unknown Type: " + value);
        }
    }

    public static void main(String[] args) {

        performAction("Hello, Users !");

        performAction(true);

        performAction(42);

        performAction(new Different());
    }
}

