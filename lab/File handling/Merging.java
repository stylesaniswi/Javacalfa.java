
import java.io.*;

public class Merging {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("newfile1.txt");
        writer.write("This is written inside first file.");
        writer.close();
        FileReader fr = new FileReader("newfile1.txt");
        int i;
        String s1 = new String();
        while ((i = fr.read()) != -1) {
            s1 = s1 + (char) i;
        }
        System.out.println("Contents of file1:  " + s1);
        fr.close();
        FileWriter writer2 = new FileWriter("newfile2.txt");
        writer2.write("This is written inside seconf file.");
        writer2.close();
        FileReader fr2 = new FileReader("newfile2.txt");
        String s2 = new String();
        while ((i = fr2.read()) != -1) {
            s2 = s2 + (char) i;
        }
        System.out.println("Contents of file2:  " + s2);
        fr.close();
        FileWriter writer3 = new FileWriter("joinfile.txt");
        writer3.write(s1 + " " + s2);
        writer3.close();
        FileReader fr3 = new FileReader("joinfile.txt");
        String s3 = new String();
        while ((i = fr3.read()) != -1) {
            s3 = s3 + (char) i;
        }
        System.out.println("Contents of joined file: " + s3);
        fr2.close();

        fr3.close();
    }
}
