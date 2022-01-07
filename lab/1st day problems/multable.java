import java.util.Scanner;

public class multable {
    static public void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = n.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (i * num));
        }
        n.close();
    }
}
