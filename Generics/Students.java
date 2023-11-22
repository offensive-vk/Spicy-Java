package Generics;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        
        Management<Integer> One = new Management<>("Manish", 8023, "IT");
        RegularStudent<Integer> R;
        SpecialStudent<Integer> S;

        
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
    public abstract Regular setDetails();
    public abstract Regular getDetails(Regular Student);
    public abstract void addStudent(Regular Student);
    public abstract void deleteStudent(Regular Student);
}
interface SpecialStudent<S> extends RegularStudent<S> {
    public abstract void SpecialData(Special Student);
    public abstract void setSpecialID(Special Student);
}
class Special extends Management<String> implements SpecialStudent<String> {
    
    public Special(String Name, Integer ID, String Section ){
        this.name = Name;
        this.id = ID;
        this.section = Section;
    }
    String SpecialID = "";
    @Override
    public final void SpecialData(Special Student){

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
    public Regular getDetails(Regular Student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDetails'");
    }
    @Override
    public void addStudent(Regular Student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStudent'");
    }
    @Override
    public void deleteStudent(Regular Student) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }
}
class Regular extends Management implements RegularStudent<String> {
    String RegularID;
    
    @Override
    public final void setDetails() {
        
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
class Management<M> extends Special{

    protected static Scanner sc = new Scanner(System.in);
    private String name = "";
    private Integer id = 0;
    private String section = "";

    // public Management(String Name, Integer ID, String Section ){
    //     this.name = Name;
    //     this.id = ID;
    //     this.section = Section;
    // }

}