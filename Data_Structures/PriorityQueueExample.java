package Data_Structures;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a new PriorityQueue instance
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Adding elements to the PriorityQueue
        priorityQueue.offer(30);
        priorityQueue.offer(20);
        priorityQueue.offer(50);
        priorityQueue.offer(10);
        priorityQueue.offer(40);

        // Displaying the PriorityQueue
        System.out.println("PriorityQueue: " + priorityQueue);

        // Accessing and removing elements from the PriorityQueue
        while (!priorityQueue.isEmpty()) {
            System.out.println("Removed element: " + priorityQueue.poll());
        }

        // Adding elements with custom ordering
        PriorityQueue<String> customPriorityQueue = new PriorityQueue<>((a, b) -> b.compareTo(a));
        customPriorityQueue.offer("Apple");
        customPriorityQueue.offer("Banana");
        customPriorityQueue.offer("Orange");
        customPriorityQueue.offer("Mango");

        // Displaying the custom PriorityQueue
        System.out.println("Custom PriorityQueue: " + customPriorityQueue);

        // Accessing and removing elements from the custom PriorityQueue
        while (!customPriorityQueue.isEmpty()) {
            System.out.println("Removed element: " + customPriorityQueue.poll());
        }
    }
}

/**
 * PriorityQueue is an unbounded priority queue based on a priority heap. The elements of the priority queue are ordered according to their natural ordering or by a comparator provided at queue construction time.
 */