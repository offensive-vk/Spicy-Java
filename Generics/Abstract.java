package Generics;

public final class Abstract {
    public static void main(String[] args) {

        Parent<Boolean> P = new Parent<>();
        System.out.println(P.getLength());
        P.SomeRandom(false);
        P.SomeOtherRandom(true);
    
    }
}

abstract class Human<T> {
    protected int data[];
    abstract void SomeRandom(T val);
    abstract void SomeOtherRandom(T val);
    abstract int getLength();
}

class Parent<T> extends Human<T> {
    public Parent(){
        this.data = new int[100];
    }
    @Override
    void SomeRandom(T some){
        System.out.println(some);
    }
    @Override
    void SomeOtherRandom(T someOther){
        System.out.println(someOther);
    }
    @Override
    final int getLength(){
        return this.data.length;
    }
}
