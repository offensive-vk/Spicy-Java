package Threading;

import java.util.Random;

class Business {
	int data;
	boolean state = false;
	int counter = 0;

	synchronized void producer() {
		while (counter < 10) {
			if (state == true) {
				try {
					this.wait();
				} catch (Exception e) { }
			}
			data = (int) new Random().nextInt(100);
			state = true;
			this.notify();
		}
	}

	synchronized void consumer() {
		while (counter < 10) {
			if (state == false) {
				try {
					this.wait();
				} catch (Exception e) {
				}
			}
			if (data % 2 == 0) {
				System.out.println(data + " generated number is even");
				counter++;
			} else {
				System.out.println(data + " generated number is odd");
			}
			state = false;
			this.notify();
		}
	}
}

class ITCThread extends Thread {
	Business ob;
	String name;

	public ITCThread(Business ob, String name) {
		super(name);
		this.ob = ob;
	}

	public void run() {
		if (Thread.currentThread().getName().equals("producer"))
			ob.producer();
		else
			ob.consumer();
	}
}

public class ITC {

	public static void main(String[] args) {
		Business ob = new Business();

		ITCThread t1 = new ITCThread(ob, "producer");
		ITCThread t2 = new ITCThread(ob, "consumer");
		t1.start();
		t2.start();
	}
}