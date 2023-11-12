package Generics;

public class GenericPair {
    public static void main(String[] args) {
        // Create a Pair of integers
        Pair<Integer, Integer> intPair = new Pair<>(10, 20);
        System.out.println("Pair of Integers: " + intPair.getFirst() + ", " + intPair.getSecond());

        // Create a Pair of strings
        Pair<String, String> stringPair = new Pair<>("Hello", "World");
        System.out.println("Pair of Strings: " + stringPair.getFirst() + ", " + stringPair.getSecond());

        // Create a mixed pair.
        Pair<Integer, Boolean>complex = new Pair<>(900, false);
        System.out.println("Complex Pair : " + complex.getFirst() + ", " + complex.getSecond());
    }
}
/**
 * Represents a generic pair of objects.
 * 
 * @param <F> the type of the first object in the pair
 * @param <S> the type of the second object in the pair
 */
class Pair<F, S> {
    private F first;
    private S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    public Pair() { 
        System.out.println();
        System.out.println(this.hashCode());
    }
    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}