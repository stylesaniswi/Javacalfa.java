import java.util.Scanner;

public class divisible {
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = n.nextInt();
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("The number is divisible by 3 and 5");
        } else {
            System.out.println("The number is not divisible by 3 and 5");
        }
        n.close();
    }
}
