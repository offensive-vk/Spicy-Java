package Generics;

// A generic class with a Comparable constraint
class GenericBox<T extends Comparable<T>> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    // A method that compares two values using the Comparable interface
    public boolean isEqualTo(GenericBox<T> otherBox) {
        return this.value.compareTo(otherBox.getValue()) == 0;
    }
}
// A generic method with constraints
class GenericMethod {
    // This method accepts an array of objects that implement Comparable
    static <T extends Comparable<T>> T findMax(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
}

public class GenericConstraintsExample {
    public static void main(String[] args) {
        // Using GenericBox with Integer values
        GenericBox<Integer> intBox1 = new GenericBox<>(10);
        GenericBox<Integer> intBox2 = new GenericBox<>(20);

        System.out.println("Integer Boxes are equal: " + intBox1.isEqualTo(intBox2));

        // Using GenericBox with String values
        GenericBox<String> strBox1 = new GenericBox<>("Hello");
        GenericBox<String> strBox2 = new GenericBox<>("World");

        System.out.println("String Boxes are equal: " + strBox1.isEqualTo(strBox2));

        // Using the generic method to find the maximum value
        Integer[] intArray = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        System.out.println("Max Integer value: " + GenericMethod.findMax(intArray));

        String[] strArray = {"apple", "banana", "orange", "grape"};
        System.out.println("Max String value: " + GenericMethod.findMax(strArray));
    }
}
