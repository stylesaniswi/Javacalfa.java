public class ReverseArray {
    public static void reverse(int arr[], int n) {
        int[] temp = new int[n];
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            temp[j] = arr[i];
            j = j - 1;
        }
        System.out.println("printing array elements after reversing: ");
        for (int i = 0; i < temp.length; i++)
            System.out.print(temp[i] + " ");
    }

    public static void main(String[] args) {
        int arr[] = { 10, 12, 25, 32, 40, 54, 60 };
        int length = arr.length;
        reverse(arr, length);

    }
}
