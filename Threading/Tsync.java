package com.apex.mca.threading;

class Task
{
	 void greetMessage(String name) 
	{
		for(int i=0;i<2;i++)
		{
			System.out.println("Hello ");
			try{Thread.sleep(1000);}catch(InterruptedException e){}
			System.out.println(name);
		}
	}
}


class MyThread extends Thread
{
	Task ob;
	String name;
	MyThread(Task ob,String name)
	{
		this.name=name;
		this.ob=ob;
	}
	
	@Override
	public void run()
	{
		ob.greetMessage(this.name);
	}
}

public class Tsync {

	public static void main(String[] args) {
		Task ob=new Task();
		MyThread t1=new MyThread(ob,"Kuldeep");
		MyThread t2=new MyThread(ob,"Santosh");
		MyThread t3=new MyThread(ob,"Nancy");
		t1.start();
		t2.start();
		t3.start();
	}

}
