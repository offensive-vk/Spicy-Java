package Data_Structures;

import java.util.TreeMap;
import java.util.Map;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a new TreeMap instance
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding elements to the TreeMap
        treeMap.put("Alice", 85);
        treeMap.put("Bob", 90);
        treeMap.put("Charlie", 75);
        treeMap.put("David", 95);
        treeMap.put("Eve", 80);

        // Displaying the TreeMap
        System.out.println("Student Scores: " + treeMap);

        // Accessing elements in the TreeMap
        System.out.println("Bob's Score: " + treeMap.get("Bob"));

        // Checking if a key exists in the TreeMap
        String name = "Frank";
        if (treeMap.containsKey(name)) {
            System.out.println(name + "'s Score: " + treeMap.get(name));
        } else {
            System.out.println(name + "'s Score not found.");
        }

        // Removing an element from the TreeMap
        treeMap.remove("Eve");
        System.out.println("After removing Eve's Score: " + treeMap);

        // Iterating over the TreeMap
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking the size of the TreeMap
        System.out.println("Number of students: " + treeMap.size());

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("After clearing the TreeMap: " + treeMap);
    }
}

/**
 * TreeMap is a red-black tree-based implementation of the SortedMap interface in Java. It stores key-value pairs in sorted order based on the natural ordering of keys or a custom comparator.
 */