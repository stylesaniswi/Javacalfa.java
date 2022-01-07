import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String a, b = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string");
        a = s.nextLine();
        a = a.toLowerCase();
        int n = a.length();
        for (int i = n - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }

        if (a.equals(b)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
