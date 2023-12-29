package Data_Structures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the queue
        queue.add("Task 1");
        queue.add("Task 2");
        queue.add("Task 3");

        // Display the elements in the queue
        System.out.println("Queue elements: " + queue);

        // Peek: Retrieve the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Size: Get the number of elements in the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Poll: Retrieve and remove the front element
        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        // Display the updated queue
        System.out.println("Queue after removal: " + queue);

        // Check if the queue contains a specific element
        boolean containsTask2 = queue.contains("Task 2");
        System.out.println("Queue contains Task 2: " + containsTask2);

        // Offer: Add an element to the queue (returns true if successful)
        boolean offerResult = queue.offer("New Task");
        System.out.println("Offer result: " + offerResult);

        // Display the final queue
        System.out.println("Final queue: " + queue);
    }
}
