package Generics;
public class Hello {
    public static <Type> void displayMessage(Type message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        displayMessage("Hello, Generics!");
        displayMessage(42);
        displayMessage(3.14);
    }
}
