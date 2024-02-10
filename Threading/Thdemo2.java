package Threading;

class MyThread5 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			Thread.yield();
			System.out.println("hello from child printed by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}

public class Thdemo2 {
	public static void main(String[] args) {

		MyThread4 ob = new MyThread4();
		Thread t = new Thread(ob);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("hello from main printed by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}