package Threading;

class MyThread4 extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("hello from child printed by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}
public class MTDemo {

	public static void main(String[] args) {

		MyThread4 ob = new MyThread4();
		ob.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("hello from main printed by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) { }
		}
	}
}