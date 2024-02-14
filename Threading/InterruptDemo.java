package Threading;

class LazyThread extends Thread {
	public void run() {
		for (int i = 0; i < 100000; i++) {
			System.out.println("i am lazy thread i am going to sleep. ");
		}
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Who is this ..... ");
		}

	}
}

public class InterruptDemo {
	public static void main(String[] args) {
		LazyThread ob = new LazyThread();
		ob.start();
		ob.interrupt();
	}
}