package Advanced;
import java.util.*;
public class 2DArray {
    //Program to create multi dimensional arrays and display the elements.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n :: Enter The Size of Array (Row)(Column):: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("\n\t\t\t ::Enter Array Element ::");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.print("\n\t\t\t :: Array Elements Are ::\n");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
            System.out.print(arr[i][j]+" ");
            }
            System.out.println("\n");
        }
        sc.close();
    }
}