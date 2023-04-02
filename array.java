import java.util.*;
class Array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    
        System.out.println("\n :: Enter The Size of Array :: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("\n\t\t\t ::Enter Array Element ::");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\n\t\t\t :: Array Elements Are ::\n");
        for(int i = 0; i<size; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }

}