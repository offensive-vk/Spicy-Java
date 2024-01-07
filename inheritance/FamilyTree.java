import java.util.*;
import java.io.*;
package inheritance;

interface Human {

    void sleep();
    void speak();
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
    public final void sleep() {
        System.out.println(this.name+" is Sleeping.");
    }
    public final void speak() {
        System.out.println("Human is Speaking.");
    }
    public final void breath() {
        System.out.println("Human is Breathing.");
    }
    public final void drink() {
        System.out.println("Human is Drinking (Water/Other).");
    }
    public final void die() {
        System.out.println("Human is going to DIE. (MAX_AGE Reached).");
    }
}
public class FamilyTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name: ");
        String n = sc.nextLine();
        System.out.println("Please Enter Your Age: ");
        int a = sc.nextInt();
        System.out.println("\n=========\n===============\n");
        System.out.println("Please Enter Your Gender: ");
        String g = sc.nextLine();

        HumanConstructor H = new HumanConstructor(n, g, a);
        H.sleep();
        H.drink();
        sc.close();
    }
}