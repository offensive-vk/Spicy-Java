package Generics;
/**
 * The `Log` class is a utility class that provides methods for logging messages and data.
 * It includes a `Message` method for printing messages to the console, and a `log` method for logging data of any type.
 */
public class Log {
    /**
     * The entry point of the program. Demonstrates the usage of the `Message` method by printing different types of messages.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Message("Hello, Generics!");
        Message(4274);
        Message(3.144);
    }
    
    /**
     * Prints the given message to the console.
     * 
     * @param message the message to be printed
     * @param <Type> the type of the message
     */
    public static <Type> void Message(Type message) {
        System.out.println(message);
    }
    /**
     * Logs the given data to the console. Accepts a variable number of arguments of any type and prints them separated by a space.
     * 
     * @param data the data to be logged
     * @param <TData> the type of the data
     * @param <Type> the type of the data elements
     * @return the logged data
     */
    @SuppressWarnings("unchecked")
    @SafeVarargs
    public static <TData, Type> TData log(TData ...data) {
        for (TData var: data) {
            System.out.print(" "+var);
        }
        return (TData) data;
    }
}

