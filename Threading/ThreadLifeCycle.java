package Threading;

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class ThreadLifeCycle {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();

        System.out.println("Thread state after creation: " + myThread.getState());

        myThread.start();
        System.out.println("Thread state after starting: " + myThread.getState());

        try {
            Thread.sleep(1000); // Let the thread run for 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after 1 second: " + myThread.getState());

        try {
            myThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after completion: " + myThread.getState());
    }
}
