import java.util.ArrayList;
import java.util.List;

class Kid {
    private String name;
    private int age;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return name + " (" + age + " years old)";
    }
}

class Wife {
    private String name;
    private int age;
    private List<Kid> kids;

    public Wife(String name, int age) {
        this.name = name;
        this.age = age;
        this.kids = new ArrayList<>();
    }

    public void addChild(String name, int age) {
        Kid kid = new Kid(name, age);
        kids.add(kid);
    }

    public String getKidsInfo() {
        List<String> kidsInfo = new ArrayList<>();
        for (Kid kid : kids) {
            kidsInfo.add(kid.getInfo());
        }
        return String.join(", ", kidsInfo);
    }

    public String getInfo() {
        return name + " (Wife, " + age + " years old)";
    }
}

class Husband {
    private String name;
    private int age;
    private Wife wife;

    public Husband(String name, int age) {
        this.name = name;
        this.age = age;
        this.wife = null;
    }

    public void marry(Wife wife) {
        this.wife = wife;
    }

    public String getInfo() {
        if (wife != null) {
            return name + " (Husband, " + age + " years old) - Married to " + wife.getInfo();
        } else {
            return name + " (Husband, " + age + " years old) - Single";
        }
    }
}

public class Life {
    public static void main(String[] args) {
        Wife wife = new Wife("Sneha", 27);
        Husband husband = new Husband("Madhav", 30);
        husband.marry(wife);
        wife.addChild("John", 5);
        wife.addChild("Clair", 3);

        System.out.println(husband.getInfo());
        System.out.println("Children: " + wife.getKidsInfo());
    }
}
