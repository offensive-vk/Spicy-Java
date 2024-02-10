package Abstract;

abstract public class Employee {
	int eid;
	String name;

	public Employee(int eid, String name) {
		this.eid = eid;
		this.name = name;
	}

	void companyName() {
		System.out.println("APEX");
	}

	abstract void printDetails();
}

class RegEmp extends Employee {

	int salary;
	int basic, hra;

	RegEmp(int eid, String name, int basic, int hra) {
		super(eid, name);
		this.basic = basic;
		this.hra = hra;
		salary = this.basic + this.hra;
	}

	void printDetails() {
		System.out.printf("Eid:%d name:%s salary:%d hra:%d basic:%d", eid, name, salary, basic, hra);
	}

}

class DailyWEmp extends Employee {

	int salary;
	int dailywage, noofdays;

	DailyWEmp(int eid, String name, int dailywage, int noofdays) {
		super(eid, name);
		this.dailywage = dailywage;
		this.noofdays = noofdays;
		salary = this.noofdays * this.dailywage;
	}

	void printDetails() {
		System.out.printf("Eid:%d name:%s salary:%d daily wage:%d no of days:%d", eid, name, salary, dailywage,noofdays);
	}
}