package Abstract;
import java.util.Scanner;

abstract class Shape {
	Scanner sc = new Scanner(System.in);

	public void Message() {
		System.out.println("Abstract class demo");
	}

	abstract public void computeArea();
}

class Circle extends Shape {
	public void computeArea() {
		System.out.println("enter radius");
		float radius = sc.nextFloat();
		System.out.println("Area of circle=" + (3.14 * radius * radius));
	}
}

class Square extends Shape {
	public void computeArea() {

		System.out.println("enter side");
		float side = sc.nextFloat();
		System.out.println("Area of square=" + (side * side));
	}
}

class Triangle extends Shape {
	public void computeArea() {
		System.out.println("enter base");
		float base = sc.nextFloat();
		System.out.println("enter height");
		float height = sc.nextFloat();
		System.out.println("Area of triangle=" + (.5 * base * height));
	}
}

public class AbstractDemo {
	public static void main(String[] args) {
		Shape ob = new Circle();
		ob.Message();
		ob.computeArea();

		ob = new Triangle();
		ob.Message();
		ob.computeArea();

		ob = new Square();
		ob.Message();
		ob.computeArea();

	}
}