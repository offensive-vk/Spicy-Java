package Threading;

public class ThreadStatesDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000); // Thread will be in timed waiting state for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Thread state after creation: " + thread.getState());

        thread.start();
        System.out.println("Thread state after starting: " + thread.getState());

        try {
            Thread.sleep(500); // Let the thread start before checking its state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after 500ms: " + thread.getState());

        try {
            thread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread state after completion: " + thread.getState());
    }
}
