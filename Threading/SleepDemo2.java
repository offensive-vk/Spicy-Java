package Threading;

public class SleepDemo2 {
	public static void main(String[] args) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("This is slide no " + i);
			Thread.sleep(3000);
		}
	}
}