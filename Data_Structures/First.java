package Data_Structures;

public class First {
    public static void main(String[] args) {
        System.out.println("Package for Various Data Structures in Java. \n e.g (ArrayList, LinkedLists .etc)");
        System.out.println("\n========================\n");
        String[] names  = {"Arrays", "ArrayList", "LinkedList", "HashMap", "HashSet", "Queue", "Stack", "TreeMap", "PriorityQueue"};

        for(int c = 0; c < names.length; c++) {
            System.out.printf("%d. %s\n", c, names[c]);
        }
    }
}
