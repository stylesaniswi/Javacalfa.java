import java.io.File; // File class
import java.io.FileNotFoundException; // class to handle errors
import java.util.Scanner; // Scanner class to read text files

public class Manager {
    public static void main(String[] args) {
        System.out.println(" NAme Age Address Salary Loan Amount Loan Type ");
        try {
            File obj = new File("banking.txt"); // creating the file object
            Scanner sc = new Scanner(obj); // creating the object of scanner class to read file content
            int i = 1;
            while (sc.hasNextLine()) { // Run while loop until the file has lines
                String data = sc.nextLine();
                System.out.println(i + ". " + data); // printing the line of file
                i++;
            }
            sc.close();
        } catch (FileNotFoundException e) { // to catch exception
            System.out.println("An error occurred.");
            e.printStackTrace(); // print the stack of exception
        }
    }
}