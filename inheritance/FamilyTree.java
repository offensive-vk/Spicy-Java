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

    public HumanConstructor
    (String n, String g, int a) {
        this.name = n;
        this.gender = g;
        this.age = a;
        System.out.println("Human Creation Successful.");
    }
    void sleep();
    void speak();
    void breath();
    void drink();
}
public class FamilyTree {
    public static void main(String[] args) {
        HumanConstructor H = new HumanConstructor("Adam", "Male", 10);

    }
}