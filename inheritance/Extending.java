package Inheritance;

public class Extending {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
// Define the parent interface
interface ParentInterface {
    void parentMethod();
}

// Define the child interface extending the parent interface
interface ChildInterface extends ParentInterface {
    void childMethod();
}

// Implement the child interface
class MyClass implements ChildInterface {
    @Override
    public void parentMethod() {
        System.out.println("Implementation of parentMethod() in MyClass");
    }

    @Override
    public void childMethod() {
        System.out.println("Implementation of childMethod() in MyClass");
    }
}
