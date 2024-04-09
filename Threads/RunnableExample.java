package Threads;

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}