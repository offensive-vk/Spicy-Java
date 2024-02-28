package Data_Structures;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a new HashSet instance
        HashSet<String> fruits = new HashSet<>();

        // Adding elements to the HashSet
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Apple"); // Adding duplicate element

        // Displaying the HashSet
        System.out.println("Fruits: " + fruits);

        // Checking if an element exists in the HashSet
        String fruit = "Banana";
        if (fruits.contains(fruit)) {
            System.out.println(fruit + " exists in the set.");
        } else {
            System.out.println(fruit + " does not exist in the set.");
        }

        // Removing an element from the HashSet
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterating over the HashSet using Iterator
        System.out.println("Fruits:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Checking the size of the HashSet
        System.out.println("Number of fruits: " + fruits.size());

        // Clearing the HashSet
        fruits.clear();
        System.out.println("After clearing the HashSet: " + fruits);
    }
}

/**
 * HashSet is a hash table-based implementation of the Set interface in Java. It stores unique elements and does not allow duplicates. It does not maintain insertion order.
 */