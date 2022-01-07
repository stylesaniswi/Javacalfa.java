import java.util.Scanner;

public class SubjectName {
    public static void main(String[] args) {
        int room_num;
        Scanner n = new Scanner(System.in);
        System.out.println("Enter a number: ");
        room_num = n.nextInt();
        if (room_num == 604) {
            System.out.println("Java Programming");
        } else if (room_num == 605) {
            System.out.println("Python Programming");
        } else {
            System.out.println("Invalid input");
        }
    }
}