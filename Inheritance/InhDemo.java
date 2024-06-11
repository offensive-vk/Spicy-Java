package Inheritance;

class Parent {
	public Parent(int i) {
		System.out.println("Parent class Cons called");

	}
}

class Child extends Parent {
	public Child() {
		super(10);
		System.out.println("Child class Cons called");

	}
}

public class InhDemo {

	public static void main(String[] args) {
		Child ob = new Child();

	}
}