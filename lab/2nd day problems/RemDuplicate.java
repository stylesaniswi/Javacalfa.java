
public class RemDuplicate {
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
        int arr[] = { 10, 12, 25, 25, 32, 32, 40, 54, 54, 60, 60 };
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        System.out.println("printing array elements after removing: ");
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
    }
}
