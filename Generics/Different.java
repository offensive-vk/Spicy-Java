package Generics;
/**
 * Default Class for Execution
 * @author Vedansh
 * @category final
 */
public final class Different {
    final static int DEFAULT = 100;
    public static final char PUBLIC_KEY = "9GF0BA-HP[A9G]";
    public static <T> void performSomething(final T value) {

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

        performSomething("Hello, Users !");

        performSomething(true);

        performSomething(42);

        performSomething(new Different());
    }
}

