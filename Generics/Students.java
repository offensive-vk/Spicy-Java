package Generics;

public class Students {
    public static void main(String[] args) {
        
    }
}
/**
 * @root Interface
 * Normal Student Interface.
 */
interface Student {
    String name = "";
    Integer id = 0;
    String section = "";
}
interface RegularStudent<R> extends Student {
    public abstract R setDetails();
    public abstract R getDetails(RegularStudent<R> Student);
    public abstract void addStudent(RegularStudent<R> Student);
    public abstract void deleteStudent(RegularStudent<R> Student);
}
interface SpecialStudent<S> extends RegularStudent<S> {
    String SpecialID = "";
    public abstract S SpecialData(SpecialStudent<S> Student);
}