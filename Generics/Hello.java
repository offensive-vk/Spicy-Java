package Generics;

import java.util.Scanner;

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
    public static void main(String[] args) throws Exception{

        displayMessage("Hello, Generics!");
        displayMessage(424);
        displayMessage(3.141);
        Scanner sc = new Scanner(System.in);
        doSomething(new Object());

        sc.close();
    }
    
}
