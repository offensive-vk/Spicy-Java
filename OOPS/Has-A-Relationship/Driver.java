package com.apex.relationship;

public class Driver {
	
public static void main(String[] args) {
	
	Address add=new Address("mansarovar","jaipur","rj","302020");
	Student st1=new Student(101,"James",99.99f,add);
	Student st2=new Student(102,"King",88.88f,add);
	
	College cl=new College("APEX", add);
	cl.addStudent(st1);
	cl.addStudent(st2);
	
	cl.printDetails();
	
}
	


}
