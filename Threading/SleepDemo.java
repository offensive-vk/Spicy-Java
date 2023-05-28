package com.apex.mca.threading;
public class SleepDemo {

	public static void main(String[] args) {
		Thread t=new Thread()
				{
					public void run()
					{
						for(int i=0;i<100;i++)
						{
							System.out.println("i am lazy thread "+i);
						}
						try {
								System.out.println("i am going to sleep fro 5 sec");
								Thread.sleep(5000);
								System.out.println("i woke up sleeping");
							}
							catch(InterruptedException e)
							{
								System.out.println("Lazy Thread Inturrepted");
							}
						}
					};
					t.start();
					t.interrupt();
			}
}
