import java.util.*;
import java.io.*;

public class Reverse {
    public static void main(String[] args) throws IOException {
        String file = "casefile.txt";
        Scanner scan = new Scanner(System.in);
        FileWriter fw = new FileWriter(file);

        System.out.println("Enter the Text:");
        String input = scan.nextLine();
        fw.write(input);
        fw.close();
        FileReader fr = new FileReader(file);
        int i;
        String s = new String();
        while ((i = fr.read()) != -1)
            s = s + (char) i;
        char[] arr = s.toCharArray();
        System.out.println("After Reverse: ");
        for (int j = arr.length - 1; j >= 0; j--) {
            System.out.print(arr[j]);
        }
        fr.close();
        scan.close();
    }
}
