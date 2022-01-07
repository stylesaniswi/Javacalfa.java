
import java.util.*;

class Arrange {

    public static void main(String[] args) {

        String Takestr;
        String Lowerstr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        Takestr = sc.nextLine();
        Lowerstr = Takestr.toLowerCase();
        // Converting string into an array for computation
        char sorted[] = Lowerstr.toCharArray();

        char temp;
        // SORTING THE STRING IN ACCENDING ORDER
        int i = 0;
        while (i <= sorted.length) {
            int j = i + 1;
            while (j <= sorted.length - 1) {
                if (sorted[j] < sorted[i]) {
                    temp = sorted[i];
                    sorted[i] = sorted[j];
                    sorted[j] = temp;
                }
                j += 1;
            }
            i += 1;
        }
        sc.close();
        System.out.println("The sorted string in ascending order is:");
        System.out.println(sorted);
    }
}