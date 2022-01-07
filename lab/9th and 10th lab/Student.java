import java.util.*;

class Student {
    int id, m1, m2, m3;
    String name;

    Student(int id, String name, int m1, int m2, int m3) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class ArrayListreg {
    public static void main(String[] args) {
        Student s1 = new Student(11, "anish shrestha", 98, 75, 80);
        Student s2 = new Student(222, "bimal parajui", 91, 79, 87);
        Student s3 = new Student(33, "Anmol guragain", 88, 76, 85);
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // Traversing list
        Iterator<Student> itr = list.iterator();// getting the Iterator
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println("Student ID: " + st.id);
            System.out.println("Name: " + st.name);
            System.out.println("Java Marks: " + st.m1);
            System.out.println("C Programming Marks: " + st.m2);
            System.out.println("Python Marks: " + st.m3);
            System.out.println();
        }
    }
}
