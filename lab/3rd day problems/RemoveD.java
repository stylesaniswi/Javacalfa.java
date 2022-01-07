import java.util.Scanner;

public class RemoveD {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];
        // Changing original array
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of element in ascending array:");
        num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();

        }
        int length = removeDuplicateElements(arr, num);
        System.out.println("printing array elements after removing: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }

}
