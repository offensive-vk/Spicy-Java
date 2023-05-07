import java.util.*;
// A Program to Get Array Size and Elements and search for an element in given array..
public class search {
    public static void main(String[] args){
        System.out.print("\n\t\t\t :: A Program By Vedansh :: \n\n\t\t");
        Scanner sc = new Scanner(System.in);
        int flag = 0,i;
        System.out.print("\n\t\t\t :: Enter The Size of Array :: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("\n\t\t\t ::Enter Array Element :: ");
        for(i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("\n\t\t\t :: Enter Array Element To Be Searched :: ");
        int search = sc.nextInt();
        for(i = 0; i<size; i++){
            if(arr[i] == search){
                flag = 1;
                break; 
            }else{
                flag = 0;
            }
        }
        if(flag == 1){
            System.out.println("\n\t\t\t :: Element Found At Position :: "+i);
        }else{
            System.out.println("\n\t\t\t :: Element Not Found in Given Array ::\n");
        }

        sc.close();
    }
}
