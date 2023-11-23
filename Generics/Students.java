package Generics;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Special A = new Special("BS5GS7", "John Wick", "A", 123);
        Regular R = new Regular("S0GANG", "Jane Smith", "A", 6543);
        A.ManualFill();
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
        System.out.printf("Your Current Special ID is: %s\n", this.SpecialID);
        System.out.println("Do you wish to edit it? ");
        Boolean c = sc.nextBoolean();
        if(c) this.SpecialID = sc.next();
        if(!c) System.out.println("Done. ");
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

    public Regular(String _id, String name, String section, Integer id) {
        super.id = id;
        super.name = name;
        super.section = section;
        this.RegularID = _id;
    }

    @Override
    public final void setDetails(Regular student) {
        // Your implementation here
        System.out.println();
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

