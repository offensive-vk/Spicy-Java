package com.apex.mca.threading;

class ChildThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Task1 exe by "+Thread.currentThread().getName());
			try{Thread.sleep(1000);}
			catch(InterruptedException e) {}
		}
	}
}




public class ThreadingDemo {
	public static void main(String[] args) {
		Thread.currentThread().setName("Papa Thread");
		ChildThread1 t1=new ChildThread1();
		t1.setName("Baby1 Thread");
		t1.start();
		t1.start();
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello from Main Thread exe by "+Thread.currentThread().getName());
			try{Thread.sleep(1000);}
			catch(InterruptedException e) {}
		}

	}

}
