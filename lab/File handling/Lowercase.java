import java.io.*;

public class Lowercase {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("file.txt", true);
        writer.write("IT WILL CHANGE CAPS TO LOWER");
        writer.close();
        FileReader fr = new FileReader("file.txt");
        int i;
        String s = new String();
        while ((i = fr.read()) != -1)
            s = s + (char) i;
        System.out.println("Initial String:  " + s);
        System.out.println("Lower case:  " + s.toLowerCase());
        fr.close();
    }
}
