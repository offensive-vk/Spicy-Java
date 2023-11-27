package Data_Structures;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        // Create a stack
        Stack<String> stack = new Stack<>();

        // 1. Pushing elements onto the stack
        stack.push("Java");
        stack.push("is");
        stack.push("fun");

        // Display the elements in the stack
        System.out.println("Stack elements after pushing: " + stack);

        // 2. Popping elements from the stack
        String poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack elements after popping: " + stack);

        // 3. Peeking at the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element without removal: " + topElement);
        System.out.println("Stack elements after peeking: " + stack);

        // 4. Checking if the stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // 5. Searching for an element in the stack
        String searchElement = "Java";
        int position = stack.search(searchElement);
        System.out.println("Position of '" + searchElement + "' in the stack: " + position);

        // 6. Clearing the stack
        stack.clear();
        System.out.println("Stack elements after clearing: " + stack);

        // 7. Checking the size of the stack
        System.out.println("Size of the stack: " + stack.size());
    }
}