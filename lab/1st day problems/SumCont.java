import java.util.Scanner;

public class SumCont {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int choice = 1;
        while (choice == 1) {
            System.out.println("enter 1 numbers");
            int a = n.nextInt();
            System.out.println("enter 2 numbers");
            int b = n.nextInt();
            System.out.println("The sum of " + a + " and " + b + " is " + (a + b));
            System.out.println();
            System.out.println("Enter you choice :\n 1 : Continue \n 0 : Stop");
            choice = n.nextInt();
        }
        n.close();
    }
}