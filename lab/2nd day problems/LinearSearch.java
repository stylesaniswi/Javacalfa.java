import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num, key;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter no. of element in array:");
        num = scan.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println("Enter the Key to be searched in the array: ");
        key = scan.nextInt();
        System.out.println(key + " is found at index: " + linearSearch(arr, key));

    }

}
