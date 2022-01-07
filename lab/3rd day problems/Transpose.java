import java.util.*;

public class Transpose {
    public static void main(String[] args) {
        int rows, cols, sumRow;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of rows:");
        rows = scan.nextInt();
        System.out.print("Enter no. of columns:");
        cols = scan.nextInt();
        int arr[][] = new int[rows][cols];
        int transpose[][] = new int[rows][cols];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < rows; i++) {
            System.out.println("Enter the elements of " + (i + 1) + " th row: ");
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        // Calculates sum of each row of given matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();// new line
        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();// new line
        }

    }
}
