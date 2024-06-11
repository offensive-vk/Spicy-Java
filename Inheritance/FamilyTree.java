package Inheritance;
import java.util.*;
import java.io.*;

interface Human {
    void sleep();
    void speak();
    void wake();
    void breath();
    void drink();
    void die();
}

class HumanConstructor implements Human {
    String name;
    String gender;
    int age;

    public HumanConstructor(String n, String g, int a) {
        this.name = n;
        this.gender = g;
        this.age = a;
        System.out.println("Human Creation Successful.");
    }
    public final void wake() {
        System.out.println(this.name+" is Waking up.");
    }
    public final void sleep() {
        System.out.println(this.name+" is Sleeping.");
    }
    public final void speak() {
        System.out.println(this.name+" is Speaking.");
    }
    public final void breath() {
        System.out.println(this.name+" is Breathing.");
    }
    public final void drink() {
        System.out.println(this.name+" is Drinking (Water/Other).");
    }
    public final void die() {
        System.out.println(this.name+" is going to DIE. (MAX_AGE Reached).");
    }
}
public class FamilyTree {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please Enter Your Name: ");
        String n = sc.nextLine();
        System.out.println("Please Enter Your Age: ");
        int a = sc.nextInt();
        System.out.println("Please Enter Your Gender: ");
        String g = sc.next();

        HumanConstructor H = new HumanConstructor(n, g, a);

        sc.close();
    }
    public static void takeChoice(HumanConstructor H) {
        while (true) {
            System.out.println("Please Choose Your Operation: \n");
            System.out.println("1. Wake Up \n");
            System.out.println("2. Drink Something \n");
            System.out.println("3. Take Breath \n");
            System.out.println("4. Speak \n");
            System.out.println("5. Die [DANGER AHEAD] \n");
            System.out.print("Your Choice: ");
            int choice = sc.nextInt();
    
            switch (choice) {
                case 0:
                    System.out.println("Re Created An Human.");
                    //HumanConstructor X;
                    break;
                case 1:
                    H.wake();
                    break;
                case 2:
                    H.drink();
                    break;
                case 3:
                    H.breath();
                    break;
                case 4:
                    H.speak();
                    break;
                case 5:
                    H.die();
                    break;
                default:
                    System.out.println("OOPS ! Invalid Choice.. \n");
                    break;
            }
        }
    }
}