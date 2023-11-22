package Generics;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Special A = new Special("Bruh", "John Doe", "A", 123);
        Regular R = new Regular(8064, "Jane Wick", "B", 456);
    }
}

interface Student<X> {
    String name = "";
    Integer id = 0;
    String section = "";
}

interface RegularStudent<R> extends Student<R> {
    void addStudent(Regular student);
    void deleteStudent(Regular student);
}

interface SpecialStudent<S> extends RegularStudent<S> {
    void SpecialData(Special student);
    void setSpecialID(Special student);
}

abstract class Council {
    protected static Scanner sc = new Scanner(System.in);
    protected String name = "";
    protected Integer id;
    protected String section = "";
}

class Special extends Council implements SpecialStudent<String> {

    private String SpecialID;

    public Special(String _id, String name, String section, Integer id) {
        this.SpecialID = _id;
        super.id = id;
        super.name = name;
        super.section = section;
    }

    public final void ManualFill() {
        // Your implementation here
    }

    @Override
    public final void SpecialData(Special student) {
        // Your implementation here
    }

    @Override
    public final void setSpecialID(Special student) {
        if (student instanceof SpecialStudent) {
            System.out.println("Enter Your New Special ID : ");
            String ID = sc.nextLine();
            this.SpecialID = ID;
        } else {
            System.err.print("Passed Student is Not of a Special Type.");
        }
    }

    @Override
    public void addStudent(Regular student) {
        // Your implementation here
    }

    @Override
    public void deleteStudent(Regular student) {
        // Your implementation here
    }
}
class Regular extends Council implements RegularStudent<String> {
    String RegularID;

    public Regular(Integer id, String name, String section, Integer regId) {
        super.id = id;
        super.name = name;
        super.section = section;
        this.RegularID = regId.toString();
    }

    @Override
    public final void setDetails(Regular student) {
        // Your implementation here
    }

    @Override
    public final void getDetails(Regular student) {
        // Your implementation here
    }

    @Override
    public final void addStudent(Regular student) {
        // Your implementation here
    }

    @Override
    public final void deleteStudent(Regular student) {
        // Your implementation here
    }
}

