package Generics;
interface Pair<K, V > {
    K getKey();
    V getValue();
}
public class Interface <K, V> implements Pair<K, V>{
    private K key;
    private V value;

    public Interface(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Interface<>("One", 1);
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}


