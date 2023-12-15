package Data_Structures;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements by index
        System.out.println("First fruit: " + fruits.get(0));

        // Modify elements
        fruits.set(1, "Grapes");

        // Iterate through the elements
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Check if an element is present
        System.out.println("Contains Mango: " + fruits.contains("Mango"));

        // Remove an element
        fruits.remove("Orange");

        // Size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size());
    }
}
