import java.util.*;

public class asterikseries {
    static public void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        num = n.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        n.close();
    }

}
