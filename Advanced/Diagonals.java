// Program to Display the sum of all the diagonals in the given array.
package Advanced;
import java.util.*;

public class Diagonals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("\n :: Enter The Size of Array (Row)(Column) :: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        System.out.println("\n ::Enter Array Element ::");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
                if (arr[i] == arr[j]) {
                    sum = sum + arr[i][j];
                }
            }
        }

        System.out.print("\n :: Sum of Diagonals of Array Elements Is :: " + sum);
        sc.close();
    }
}
