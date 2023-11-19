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
    public abstract void setSpecialID(String ID);
}

class Management<M> implements SpecialStudent<M> {
    
    public String name = "";
    public Integer id = 0;
    public String section = "";

    public Management(String n, Integer i, String s ){
        this.name = n;
        this.id = i;
        this.section = s;
    }
    @Override
    public M SpecialData(SpecialStudent<M> Student){
        return null;
    }
    public void setSpecialID(String ID){

    }
    public final M setDetails() {
        return null;
    }
    public final M getDetails(RegularStudent<M> Student) {
        return null;
    }
    public final void addStudent(RegularStudent<M> Student) {

    }
    public final void deleteStudent(RegularStudent<M> Student) {

    }
}