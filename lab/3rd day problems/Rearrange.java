import java.util.*;

public class Rearrange {

    static int[] rearrange(int[] arr, int n) {
        int temp[] = new int[n];

        int small = 0, large = n - 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }

        return temp;
    }

    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of element in ascending array:");
        num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        int result[];

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        result = rearrange(arr, arr.length);

        System.out.println("New Array ");
        System.out.println(Arrays.toString(result));

    }
}
