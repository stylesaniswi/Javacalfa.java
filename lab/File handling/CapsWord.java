import java.util.*;
import java.io.*;

public class CapsWord {
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
        String result = "";
        Scanner linescan = new Scanner(s);
        while (linescan.hasNext()) {
            String word = linescan.next();
            result = result + Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
        }
        System.out.println(result);
        fr.close();
        scan.close();
        linescan.close();
    }
}
