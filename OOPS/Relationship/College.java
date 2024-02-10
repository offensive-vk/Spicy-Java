package Relationship;

public class College {
	String name;
	Address addr;
	static int counter = 0;
	Student[] arr;

	public College(String name, Address addr) {
		this.name = name;
		this.addr = addr;
		arr = new Student[100];
	}

	void addStudent(Student stu) {

		arr[counter] = stu;

		counter++;
	}

	void printDetails() {
		System.out.println(name + " " + addr.printDetails());
		for (Student st : arr) {
			if (st != null)
				System.out.println(st.printDetails());
		}
	}
}