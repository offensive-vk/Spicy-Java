package inheritance;

public class PermanentEmployee extends Employee {
	float salary;
	float hra;
	float medical;
	float basic;
	
	public PermanentEmployee(int eid,String name,float hra,float medical,float basic)
	{
		super(eid,name);
		this.hra=hra;
		this.medical=medical;
		this.basic=basic;
		salary=this.hra+this.basic+this.medical;
	}

	@Override
	public String toString() {
		return "PermanentEmployee [salary=" + salary + ", hra=" + hra + ", medical=" + medical + ", basic=" + basic
				+ ", eid=" + eid + ", name=" + name + "]";
	}
	
	void displayEmployeeType()
	{
		System.out.println("Permanent Employee ");
	}


	
	

}
