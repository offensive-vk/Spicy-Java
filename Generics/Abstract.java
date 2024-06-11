package Generics;

public final class Abstract extends Parent<Integer>{
    public static void main(String[] args) {

        Parent<Boolean> P = new Parent<>();
        System.out.println(P.getLength());
        P.SomeRandom(false);
        P.SomeOtherRandom(true);
        Display();
    }
    
    public final static void Display() {
        Parent<String> X = new Parent<>();
        X.SomeOtherRandom("Display Function.");
        System.out.println(X.getLength());
    }

    public final static void Kid(){
        Kid<Integer> K = new Kid<>();
        System.out.println("Verification of Kid class: "+K.VerifyKid(K));
    }
}

/**
 * Represents a human with a generic type T.
 * 
 * <p>The Human class is an abstract class that represents a human with a generic type T. It contains an array of integers and defines abstract methods for performing some random and some other random operations on the generic type T.
 * 
 * <p>Example Usage:
 * <pre>{@code
 * Human<Integer> human = new Human<Integer>() {
 *     &#64;Override
 *     void SomeRandom(Integer val) {
 *         // Perform some random operation on val
 *     }
 * 
 *     &#64;Override
 *     void SomeOtherRandom(Integer val) {
 *         // Perform some other random operation on val
 *     }
 * 
 *     &#64;Override
 *     int getLength() {
 *         // Return the length of the data array
 *     }
 * };
 * 
 * human.SomeRandom(5);
 * human.SomeOtherRandom(10);
 * int length = human.getLength();
 * }</pre>
 * 
 * <p>In this example, we create an instance of Human with the generic type Integer. We override the abstract methods SomeRandom, SomeOtherRandom, and getLength to perform specific operations on integers. We then call these methods on the human object to perform the operations and retrieve the length of the data array.
 * 
 * <p>Main functionalities:
 * <ul>
 * <li>Represents a human with a generic type T</li>
 * <li>Contains an array of integers</li>
 * <li>Defines abstract methods for performing operations on the generic type T</li>
 * </ul>
 */
abstract class Human<T> {
    protected int data[];

    /**
     * Performs some random operation on the generic type T.
     * 
     * @param val the value of type T on which the operation is performed
     */
    abstract void SomeRandom(T val);

    /**
     * Performs some other random operation on the generic type T.
     * 
     * @param val the value of type T on which the operation is performed
     */
    abstract void SomeOtherRandom(T val);

    /**
     * Returns the length of the data array.
     * 
     * @return the length of the data array
     */
    abstract int getLength();
}
/**
 * @author Vedansh
 */
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
    protected final int getLength(){
        return this.data.length;
    }
}

final class Kid<X> extends Parent<String> {
    public final int id = 01;
    private final static String className = "Kid Class";

    public Kid(X name) {
        System.out.printf("%s constructor called ", className);
    }

    public Kid() { }
    public final Boolean VerifyKid(Kid<X> kid) {
        if(kid instanceof Kid) {
            return true;
        }
        return false;
    }
}