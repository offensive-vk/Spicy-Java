package Data_Structures;

public class God {
    public static void main(String[] args) {
        Human normal = new Human("Modi", 66, "Male");

    }
}


class Human {
    public String name;
    public Integer age;
    public String gender;

    public Human(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void eat(){
        System.out.printf("%s is Eating food. ", this.name);
    }
    void drink(){
        System.out.printf("%s is drinking water ", this.name);
    }
    void walk(){
        System.out.printf("%s is walking ", this.name);
    }
}