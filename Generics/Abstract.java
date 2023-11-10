package Generics;

public final class Abstract {
    public static void main(String[] args) {
        
    }
}

abstract class Human<T> {
    protected int data[];
    abstract void SomeRandom();
    abstract void SomeOtherRandom();
    abstract int getLength();
}

class Parent<Type> extends Human<Integer> {
    public Parent(){
        this.data = new int[100];
    }
    void SomeRandom(Type some){
        System.out.println(some);
    }
    void SomeOtherRandom(Type someOther){
        System.out.println(someOther);
    }
    final int getLength(){
        return this.data.length;
    }
}