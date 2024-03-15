package Data_Structures;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap instance
        Map<String, Integer> studentScores = new HashMap<>();

        // Adding elements to the HashMap
        studentScores.put("Alice", 85);
        studentScores.put("Bob", 90);
        studentScores.put("Charlie", 75);
        studentScores.put("David", 95);
        studentScores.put("Eve", 80);

        // Displaying the HashMap
        System.out.println("Student Scores: " + studentScores);

        // Accessing elements in the HashMap
        System.out.println("Bob's Score: " + studentScores.get("Bob"));

        // Checking if a key exists in the HashMap
        String name = "Frank";
        if (studentScores.containsKey(name)) {
            System.out.println(name + "'s Score: " + studentScores.get(name));
        } else {
            System.out.println(name + "'s Score not found.");
        }

        // Removing an element from the HashMap
        studentScores.remove("Eve");
        System.out.println("After removing Eve's Score: " + studentScores);

        // Iterating over the HashMap
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Checking the size of the HashMap
        System.out.println("Number of students: " + studentScores.size());

        // Clearing the HashMap
        studentScores.clear();
        System.out.println("After clearing the HashMap: " + studentScores);
    }
}

/**
 * HashMap is a hash table-based implementation of the Map interface in Java. It stores key-value pairs and allows fast retrieval of values based on keys. It does not maintain insertion order.
 */