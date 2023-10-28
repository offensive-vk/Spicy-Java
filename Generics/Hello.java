package Generics;

public class Hello {
    public static <Type> void displayMessage(Type message) {
        System.out.println(message);
    }
    private static <X> X doSomething(X data){
        String some = "Something";
        System.out.println(some);
        System.out.println("-> "+data+" \n ");
        return data;
    }
    public static void main(String[] args) {
        displayMessage("Hello, Generics!");
        displayMessage(42);
        displayMessage(3.14);

        doSomething(new Object());
    }
    
}
