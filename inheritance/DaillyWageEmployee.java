package Inheritance;

public class DailyWageEmployee extends Employee {

	float salary;
	float dailyWage;
	int noofdays;

	public DailyWageEmployee(int eid, String name, float dailyWage, int noofdays) {
		super(eid, name);
		this.dailyWage = dailyWage;
		this.noofdays = noofdays;
		salary = this.noofdays * this.dailyWage;
	}

	@Override
	public String toString() {
		return "DailyWageEmployee [salary=" + salary + ", dailyWage=" + dailyWage + ", noofdays=" + noofdays + ", eid="
				+ eid + ", name=" + name + "]";
	}

	void displayEmployeeType() {
		System.out.println("Daily Wage Employee ");
	}
}