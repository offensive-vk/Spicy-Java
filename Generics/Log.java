package Generics;
public class Log {
    public static <Type> void Message(Type message) {
        System.out.println(message);
    }
    public static void main(String[] args) {
        Message("Hello, Generics!");
        Message(4274);
        Message(3.144);

    }
    @SuppressWarnings("unchecked")
    @SafeVarargs
    public static <TData, Type> TData log(TData ...data) {
        for (TData var: data) {
            System.out.print(" "+var);
            
        }
        return (TData) data;
    }
}

