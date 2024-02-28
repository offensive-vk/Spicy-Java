package Data_Structures;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new LinkedList instance
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");
        linkedList.add("Apple"); // Adding duplicate element

        // Displaying the LinkedList
        System.out.println("Fruits: " + linkedList);

        // Accessing elements in the LinkedList
        System.out.println("First fruit: " + linkedList.getFirst());
        System.out.println("Last fruit: " + linkedList.getLast());
        System.out.println("Second fruit: " + linkedList.get(1));

        // Removing an element from the LinkedList
        linkedList.remove("Orange");
        System.out.println("After removing Orange: " + linkedList);

        // Iterating over the LinkedList
        System.out.println("Fruits:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Checking the size of the LinkedList
        System.out.println("Number of fruits: " + linkedList.size());

        // Clearing the LinkedList
        linkedList.clear();
        System.out.println("After clearing the LinkedList: " + linkedList);
    }
}

/**
 * LinkedList is a doubly linked list implementation of the List interface in Java. It consists of nodes where each node contains a data element and references to the next and previous nodes. It provides sequential access to elements.
 */