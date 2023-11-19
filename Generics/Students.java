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
    public abstract void setSpecialID(SpecialStudent<S> Student);
}
class Special implements SpecialStudent<String>{

}
class Regular implements RegularStudent<String> {

}
class Management<M> implements SpecialStudent<M> {

    protected static Scanner sc = new Scanner(System.in);
    private String name = "";
    private Integer id = 0;
    private String section = "";
    private String SpecialID;

    public Management(String Name, Integer ID, String Section ){
        this.name = Name;
        this.id = ID;
        this.section = Section;
    }
    @Override
    public M SpecialData(SpecialStudent<M> Student){
        return null;
    }
    @Override
    public void setSpecialID(SpecialStudent<M> student){
        if(student instanceof SpecialStudent) {
            System.out.println("Enter Your New Special ID : ");
            String ID = sc.nextLine();
            this.SpecialID = ID;
        }
    }
    @Override
    public final M setDetails() {
        return null;
    }
    @Override
    public final M getDetails(RegularStudent<M> Student) {
        return null;
    }
    @Override
    public final void addStudent(RegularStudent<M> Student) {

    }
    @Override
    public final void deleteStudent(RegularStudent<M> Student) {

    }
}