package Data_Structures;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FirstList {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Mango");

        // Display the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);

        // 1. Accessing elements by index
        System.out.println("Element at index 1: " + arrayList.get(1));

        // 2. Modifying elements by index
        arrayList.set(2, "Grapes");
        System.out.println("ArrayList after modification: " + arrayList);

        // 3. Iterating through the ArrayList using for-each loop
        System.out.print("ArrayList elements (for-each loop): ");
        for (String fruit : arrayList) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 4. Iterating through the ArrayList using Iterator
        Iterator<String> iterator = arrayList.iterator();
        System.out.print("ArrayList elements (Iterator): ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 5. Sorting the ArrayList
        Collections.sort(arrayList);
        System.out.println("ArrayList after sorting: " + arrayList);

        // 6. Checking if an element exists in the ArrayList
        String searchElement = "Banana";
        System.out.println("Is '" + searchElement + "' present? " + arrayList.contains(searchElement));

        // 7. Removing an element by index
        arrayList.remove(0);
        System.out.println("ArrayList after removing element at index 0: " + arrayList);

        // 8. Removing an element by value
        arrayList.remove("Mango");
        System.out.println("ArrayList after removing 'Mango': " + arrayList);

        // 9. Getting the size of the ArrayList
        System.out.println("Size of ArrayList: " + arrayList.size());

        // 10. Clearing the ArrayList
        arrayList.clear();
        System.out.println("ArrayList after clearing: " + arrayList);
    }
}
