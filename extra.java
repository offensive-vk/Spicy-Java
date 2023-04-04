import java.util.*;
// Program to Read name and id from the user using objects created by class.
public class extra{
    int id;
    String name;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        extra s1 = new extra(); 
        System.out.println("Enter Your Name: ");
        s1.name = sc.nextLine();
        System.out.println("Enter Your Id: ");
        s1.id = sc.nextInt();
        System.out.println("Your ID is "+s1.id);
        System.out.println("Your Name is "+s1.name);
        sc.close();
    }
}
