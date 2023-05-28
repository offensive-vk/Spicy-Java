package com.apex.conschaining;

class Gparent
{
	Gparent(int num)
	{
		System.out.println("gparent parametrized constructor");
	}
}

class Parent extends Gparent
{
	Parent()
	{
		super(10);//call to parameterized constructor of parent class
		System.out.println("parent class constructor");
	}
}

class Child extends Parent
{
	Child(int i)
	{
		System.out.println("gparent parametrized constructor");
	}
	
	Child()
	{
		this(10); //call to parameterized constructor of same class
		System.out.println("gparent default constructor");
	}
	
	
}
public class ChainingDemo {

	public static void main(String[] args) {
		Child ob=new Child();

	}

}
