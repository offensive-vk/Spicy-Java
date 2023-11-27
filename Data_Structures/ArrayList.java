package Data_Structures;

import java.rmi.MarshalException;
import java.util.HashMap;
import java.util.LinkedList;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> L = new ArrayList();
        
        for(int i = 0; i < 15; i++){
            L.add(i*57845);
            
        }
        System.out.println(L);

    }
}