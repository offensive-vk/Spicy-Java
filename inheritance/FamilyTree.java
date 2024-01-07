package inheritance;

interface Human {
    private static abstract void sleep();
    private static abstract void speak();
    private static abstract void breath();
    private static abstract void drink();

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
}
public class FamilyTree {
    
}
