import java.util.Scanner;

public class seriescomb {
    static public void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        num = n.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = num; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
