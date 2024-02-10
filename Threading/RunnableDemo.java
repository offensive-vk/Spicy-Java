package Threading;

class ChildThread4 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Task1 exe by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Thread.currentThread().setName("Papa Thread");
		ChildThread4 t1 = new ChildThread4();
		Thread t = new Thread(t1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello from Main Thread exe by " + Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			Thread.yield();
		}
	}
}