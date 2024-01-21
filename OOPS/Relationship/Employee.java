package Relationship;

public class Employee {
	int eid;
	String name;
	float salary;
	Address add;

	public Employee(int eid, String name, float salary, Address add) {
		this.eid = eid;
		this.name = name;
		this.salary = salary;
		this.add = add;
	}

	String printDetails() {
		return eid + " " + name + " " + salary + " " + add.printDetails();
	}
}