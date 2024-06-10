package Generics;
/**
 * Default Class for Execution
 * @author Vedansh
 * @category final
 */
public final class Different {
    
    public final static int DEFAULT = 101854306;
    public static final String PUBLIC_KEY = "9GF0BA01GX08";
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

