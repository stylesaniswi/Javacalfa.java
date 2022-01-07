// import java.io.Serializable;
// import java.io.*;
// import java.util.*;

// class employee implements Serializable {
// String name;
// int age;
// double salary;

// employee(String name, int age, double salary) {
// this.name = name;
// this.age = age;
// this.salary = salary;
// }

// void update() {
// Scanner scan = new Scanner(System.in);
// System.out.println("Enter new age:");
// this.age = scan.nextInt();
// System.out.println("Enter new Salary:");
// this.salary = scan.nextDouble();
// scan.close();
// }

// void Display() {
// System.out.println("Name:" + this.name);
// System.out.println("age:" + this.age);
// System.out.println("Salary:" + this.salary);
// System.out.println();
// }
// }

// public class Update {
// public static void main(String[] args) throws Exception {
// Scanner scan = new Scanner(System.in);
// employee e1 = new employee("A", 20, 20000);
// employee e2 = new employee("B", 25, 35000);
// FileOutputStream f = new FileOutputStream(new File("myobjects.txt"));
// ObjectOutputStream o = new ObjectOutputStream(f);
// o.writeObject(e1);
// o.writeObject(e2);
// o.close();
// f.close();
// FileInputStream fi = new FileInputStream(new File("myobjects.txt"));
// ObjectInputStream oi = new ObjectInputStream(fi);
// employee er1 = (employee) oi.readObject();
// er1.Display();
// employee er2 = (employee) oi.readObject();
// er2.Display();
// System.out.println("Enter name of employee to update:");
// String name = scan.nextLine();
// if (er1.name.equals(name)) {
// er1.update();
// } else if (er2.name.equals(name))
// er2.update();
// else
// System.out.println("no such employee");
// er1.Display();
// er2.Display();
// scan.close();
// }

// }
