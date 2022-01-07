import java.util.*;

class Details {
    Scanner sc = new Scanner(System.in);
    String regno = new String();
    String name = new String();
    float cgpa;
    String pname = new String();
    String sname = new String();
    String proctorname = new String();

    void input() {
        System.out.println("Enter Student Details:");
        System.out.println("Enter Registration Number:");
        regno = sc.next();
        sc.nextLine();
        System.out.println("Enter Name:");
        name = sc.nextLine();
        System.out.println("Enter CGPA:");
        cgpa = sc.nextFloat();
        System.out.println("Enter Programme Name:");
        pname = sc.next();
        sc.nextLine();
        System.out.println("Enter School Name:");
        sname = sc.nextLine();
        System.out.println("Enter Proctor Name:");
        proctorname = sc.nextLine();
    }

    void display() {
        System.out.println("Student Details::");
        System.out.println(regno + " " + name + " " + cgpa + " " + pname + " " + sname + " " + proctorname + " ");
    }

}

public class CGPA {
    public static void main(String[] args) {
        Details s1 = new Details();
        s1.input();
        s1.display();

    }
}