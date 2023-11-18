package Generics;

public class Students {
    
}
/**
 * @root Interface
 * Normal Student Interface.
 */
interface Student {
    String name = "";
    Integer id = 0;
}
interface RegularStudent<R> extends Student {

}