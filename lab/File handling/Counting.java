import java.io.*;

public class Counting {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("newfile.txt");
        writer.write("This is the era of JAVA programming");
        writer.close();
        FileReader fr = new FileReader("newfile.txt");
        int i;
        int count = 0;
        String s = new String();
        while ((i = fr.read()) != -1) {
            s = s + (char) i;
            count++;
        }
        System.out.println("Content of file:  " + s);
        System.out.println("No of characters: " + count);
        fr.close();
    }
}
