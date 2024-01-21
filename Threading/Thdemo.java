package Threading;

class Test implements Runnable {
	Thread t;

	Test(Thread t) {
		this.t = t;
	}

	public void run() {

		try {
			t.join();
		} catch (InterruptedException e) { }
		for (int i = 0; i < 10; i++) {
			System.out.println(" Hello from Test class thread");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) { }
		}
	}
}

public class Thdemo {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new Test(Thread.currentThread()));
		t.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from main thread");
			Thread.sleep(100);

		}
	}
}