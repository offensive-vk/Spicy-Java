package com.apex.mca.threading;

class Wife extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			Thread.yield();
			System.out.println("wife in bp increasing bp");
			try { 
			Thread.sleep(1000);}
			catch(InterruptedException e) {}
		}
	}
}

public class HubbyClass {
	public static void main(String[] args) throws InterruptedException {
		Wife ob=new Wife();
		ob.start();
		ob.join(5000);
		System.out.println("lets go to party");
		}
}
