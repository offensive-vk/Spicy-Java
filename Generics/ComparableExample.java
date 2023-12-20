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
