import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class Counter {
    public static void main(String args[]) throws Exception {
        FileReader fr = new FileReader("joinfile.txt");
        int i;
        String s = new String();
        while ((i = fr.read()) != -1)
            s = s + (char) i;
        System.out.println("Contents of file:");
        System.out.println(s);
        File file = new File("joinfile.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] byteArray = new byte[(int) file.length()];
        fis.read(byteArray);
        String data = new String(byteArray);
        String[] stringArray = data.split("\r\n");
        System.out.println("Number of lines in the file are ::" + stringArray.length);
        String[] sarr = s.split("\n");
        fr.close();
        fis.close();
        int colon = 0;
        for (i = 0; i < sarr.length; i++) {
            if (sarr[i].indexOf(';') != -1) {
                colon++;
            }
        }
        System.out.println("Number of lines ending with semicolon:" + colon);

    }
}
