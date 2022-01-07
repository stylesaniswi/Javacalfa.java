import java.io.*;
import java.util.Scanner;

class Loan {
    private String name, age, address, salary, loanAmount, loanType;

    // constructor for variable initialization
    Loan(String n, String age, String address, String salary, String la, String lt) {
        this.name = n;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.loanAmount = la;
        this.loanType = lt;

    }

    // function to store the data in the file
    public void createUser() {
        try {
            File fobj = new File(
                    "banking.txt"); /* creating the object of File class(Enter location according to your choice) */
            fobj.createNewFile(); // creating file
            FileWriter myWriter = new FileWriter("banking.txt",
                    true); /* creating FileWriter object to write in the file */
            BufferedWriter out = new BufferedWriter(myWriter);
            out.write(this.name + " " + this.age + " " + this.address + " " + this.salary + " " + this.loanAmount + " "
                    + this.loanType + "\n");
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}

class Banking {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name");
        String name = obj.nextLine();
        System.out.println("Enter age");
        String age = obj.nextLine();
        System.out.println("Enter Loan type and choices are Housing, Vehicle, Personal");
        String loan_type = obj.nextLine();
        System.out.println("Enter Salary");
        String sal = obj.nextLine();
        System.out.println("Enter Loan Amount");
        String loan_amount = obj.nextLine();
        System.out.println("Enter address ");
        String add = obj.nextLine();
        Loan user = new Loan(name, age, add, sal, loan_amount, loan_type);// create object of class Loan
        user.createUser();// call function to store data in file
        System.out.println("Record added successfully");
        obj.close();

    }
}