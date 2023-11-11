package inheritance;

public class MainClass {
	public static void main(String[] args) {
	
		DaillyWageEmployee ob1=new DaillyWageEmployee(101, "james", 500, 20);
		PermanentEmployee ob2=new PermanentEmployee(102, "King", 5000, 200, 40000);
		
		System.out.println(ob1);
		System.out.println(ob2);

		ob1.Display();
		ob2.Display();
		
		ob1.displayEmployeeType();
		ob2.displayEmployeeType();
	}
}
