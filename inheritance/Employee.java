package inheritance;
public class Employee {
	int eid;
	String name;
	
	void Display()
	{
		System.out.println("company name is Wipro");
	}
	
	public Employee(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
}
