import java.util.Scanner;

public class OddEven {
    static void rearrangeEvenAndOdd(int arr[], int n) {
        int j = -1, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                j++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of element in ascending array:");
        num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int n = arr.length;

        rearrangeEvenAndOdd(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
