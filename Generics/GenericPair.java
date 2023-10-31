package Generics;

public class GenericPair {
        public static void main(String[] args) {
        // Create a Pair of integers
        Pair<Integer, Integer> intPair = new Pair<>(10, 20);
        System.out.println("Pair of Integers: " + intPair.getFirst() + ", " + intPair.getSecond());

        // Create a Pair of strings
        Pair<String, String> stringPair = new Pair<>("Hello", "World");
        System.out.println("Pair of Strings: " + stringPair.getFirst() + ", " + stringPair.getSecond());
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }
}