package Advanced;

public class MathModule {
    public static void main(String[] args) {
        // Example of using Math.max()
        int num1 = 10;
        int num2 = 20;
        int maxNumber = Math.max(num1, num2);
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + maxNumber);

        // Example of using Math.min()
        int minNumber = Math.min(num1, num2);
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + minNumber);

        // Example of using Math.abs()
        double num3 = -15.67;
        double absoluteValue = Math.abs(num3);
        System.out.println("Absolute value of " + num3 + " is: " + absoluteValue);

        // Example of using Math.sqrt()
        double num4 = 25.0;
        double squareRoot = Math.sqrt(num4);
        System.out.println("Square root of " + num4 + " is: " + squareRoot);

        // Example of using Math.pow()
        double base = 3.0;
        double exponent = 4.0;
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        // Example of using Math.round()
        double num5 = 4.56;
        long roundedValue = Math.round(num5);
        System.out.println("Rounded value of " + num5 + " is: " + roundedValue);
    }
}
