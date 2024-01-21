import java.util.*;

// A Program to Get Size and Elements in a Array and Display the sum of array.
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("\n\t\t\t :: Enter The Size of Array :: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("\n\t\t\t ::Enter Array Element :: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.print("\n\t\t\t :: The Sum of All Array Elements Is :: " + sum);
        // for(int i = 0; i<size; i++){
        // System.out.println(arr[i]);
        // }
        sc.close();
    }
}
