package Inheritance;

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

public class Diamond extends B, C {
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}

interface A {
    void display();
}

class B implements A {
    public void display() {
        System.out.println("Class B");
    }
}

class C implements A {
    public void display() {
        System.out.println("Class C");
    }
}

class D implements B, C {
    public static void main(String[] args) {
        D d = new D();
        d.display();
    }
}