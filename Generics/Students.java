package Generics;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Special A = new Special("Bruh");
        Regular R = new Regular(8064);
        
    }
}
/**
 * @root Interface
 * Normal Student Interface.
 */
interface Student<X> {
    String name = "";
    Integer id = 0;
    String section = "";
}
interface RegularStudent<R> extends Student<R> {
    // public abstract Regular setDetails();
    // public abstract Regular getDetails(Regular Student);
    public abstract void addStudent(Regular student);
    public abstract void deleteStudent(Regular student);
}
interface SpecialStudent<S> extends RegularStudent<S> {
    public abstract void SpecialData(Special Student);
    public abstract void setSpecialID(Special Student);
}
abstract class Council {
    protected static Scanner sc = new Scanner(System.in);
    protected String name = "";
    protected Integer id;
    protected String section = "";

}
class Special extends Council implements SpecialStudent<String> {
    
    private String SpecialID;
    public Special(String _id, String name, String section, Integer id){
        this.SpecialID = _id;
        super.id = id;
        super.name = name;
        super.section = section;
    }
    public final void ManualFill(){

    }
    @Override
    public final void SpecialData(Special student){
        //Student.SpecialID;
    }
    @Override
    public final void setSpecialID(Special student){
        if(student instanceof SpecialStudent) {
            System.out.println("Enter Your New Special ID : ");
            String ID = sc.nextLine();
            this.SpecialID = ID;
        }
        System.err.print("Passed Student is Not of a Special Type.");
    }
    @Override
    public Regular setDetails() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDetails'");
    }
    @Override
    public Regular getDetails(Regular student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDetails'");
    }
    @Override
    public void addStudent(Regular student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    }
    @Override
    public void deleteStudent(Regular student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }
}
class Regular extends Council implements RegularStudent<String> {
    String RegularID;
    
    @Override
    public final void setDetails(Regular Student) {
        
    }
    @Override
    public final void getDetails(Regular Student) {
        
    }
    @Override
    public final void addStudent(Regular Student) {

    }
    @Override
    public final void deleteStudent(Regular Student) {

    }
}
