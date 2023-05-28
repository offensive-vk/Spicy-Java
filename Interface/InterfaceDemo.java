package com.apex.bcab.interfacedemo;

interface ICalc
{
	String projectVersion="1.0";
	int sum(int i,int j);
	int sub(int i,int j);
	int pro(int i,int j);
	int div(int i,int j);
}

class Calc implements ICalc
{

	@Override
	public int sum(int i, int j) {
		return i+j;
		
	}

	@Override
	public int sub(int i, int j) {
		
		return i-j;
	}

	@Override
	public int pro(int i, int j) {
		// TODO Auto-generated method stub
		return i*j;
	}

	@Override
	public int div(int i, int j) {
		// TODO Auto-generated method stub
		return i/j;
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		ICalc ob=new Calc();
		System.out.println("Sum="+ob.sum(10, 5));
		System.out.println("Sub="+ob.sub(10, 5));
		System.out.println("Pro="+ob.pro(10, 5));
		System.out.println("Div="+ob.div(10, 5));

	}

}
