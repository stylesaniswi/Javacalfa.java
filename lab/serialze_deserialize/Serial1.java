import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int empId;
    String name;
    int salary;

    Employee(int empId, String name, int salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
}

class Serial1 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        final String fileName = "EmployeeData.txt";
        System.out.println("Anish Shrestha-----20BCE2893");
        employees.add(new Employee(100, "Roman", 30000));
        employees.add(new Employee(160, "Nikesh", 40000));
        employees.add(new Employee(215, "Sayan", 80000));
        employees.add(new Employee(853, "Aaryan", 20000));
        employees.add(new Employee(210, "Sonish", 90000));
        // Serializetry
        try {
            FileOutputStream file = new FileOutputStream(fileName, true);
            ObjectOutputStream objectOut = new ObjectOutputStream(file);
            for (Employee emp : employees) {
                objectOut.writeObject(emp);
            }
            objectOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Employee> dEmployees = new ArrayList<Employee>();
        // De-serializetry
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream inStream = new ObjectInputStream(fileInputStream);
            for (int i = 0; i < 4; i++) {
                dEmployees.add((Employee) inStream.readObject());
            }
            inStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Those with salary less than 50000: ");
        for (Employee emp : dEmployees) {
            if (emp.salary < 50000) {
                System.out.println("Emp ID: " + Integer.toString(emp.empId) + " Name: " + emp.name);
            }
        }
    }
}