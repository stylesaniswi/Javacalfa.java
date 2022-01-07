import java.util.*;

public class SumRows {
    public static void main(String[] args) {
        int rows, cols, sumRow;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        rows = scan.nextInt();
        System.out.print("Enter no. of columns:");
        cols = scan.nextInt();
        int arr[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the elements of" + i + " th row: ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        // Calculates sum of each row of given matrix
        for (int i = 0; i < rows; i++) {
            sumRow = 0;
            for (int j = 0; j < cols; j++) {
                sumRow = sumRow + arr[i][j];
            }
            System.out.println("Sum of " + (i + 1) + " row: " + sumRow);
        }

    }
}
