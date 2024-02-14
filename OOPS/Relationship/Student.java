package Relationship;

public class Student {
	int sid;
	String name;
	float per;
	Address add;

	public Student(int sid, String name, float per, Address add) {
		super();
		this.sid = sid;
		this.name = name;
		this.per = per;
		this.add = add;
	}

	String printDetails() {
		return sid + " " + name + " " + per + " " + add.printDetails();
	}
}