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

