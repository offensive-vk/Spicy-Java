package OOPS.Incapsulation;

public class Driver {

	public static void main(String[] args) {

		Product p1 = new Product();

		p1.setDetails(101, "Shirt", 1500);

		System.out.println(p1);
	}
}