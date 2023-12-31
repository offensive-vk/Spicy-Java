package inheritance;

class A {
    void display() {
        System.out.println("Class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Class B");
    }
}

class C extends A {
    void display() {
        System.out.println("Class C");
    }
}

public class Diamond extends B, C { // Diamond Inheritance
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}
