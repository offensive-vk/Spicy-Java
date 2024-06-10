package Incapsulation;

public class Product {
	private int pid;

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	private String name;
	private float price;

	public void setDetails(int pid, String name, float price) {

		this.pid = pid;
		this.name = name;
		if (price < 1000)
			this.price = 1000;
		else
			this.price = price;
	}

	public void printDetails() {
		System.out.printf("Pid:%d Name:%s Price:%f", pid, name, price);
	}
}