package com.apex.inheritance;
public class DaillyWageEmployee extends Employee {
	
float salary;
float dailyWage;
int noofdays;
	
	public DaillyWageEmployee(int eid, String name,float dailyWage,int noofdays) {
		super(eid, name);
		this.dailyWage=dailyWage;
		this.noofdays=noofdays;
		salary=this.noofdays*this.dailyWage;
	}

	@Override
	public String toString() {
		return "DaillyWageEmployee [salary=" + salary + ", dailyWage=" + dailyWage + ", noofdays=" + noofdays + ", eid="
				+ eid + ", name=" + name + "]";
	}
	
	void displayEmployeeType()
	{
		System.out.println("Dailly Wage Employee ");
	}

}
