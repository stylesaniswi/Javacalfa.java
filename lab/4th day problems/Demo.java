import java.util.*;

class Student {
    String name;
    String regno;
    String course;
    float cgpa;

    Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Details: name, regno. course cgpa ");
        this.name = sc.next();
        this.regno = sc.next();
        this.course = sc.next();
        this.cgpa = sc.nextFloat();
    }

}

public class Demo {

    public static void main(String args[]) {
        Student[] m = new Student[10];
        for (int i = 0; i < 10; i++) {
            m[i] = new Student();
        }
        ninepointer(m);

    }

    static void ninepointer(Student[] m) {
        for (int i = 0; i < 10; ++i) {
            if (m[i].cgpa > 9)
                System.out.println("ninepointers:" + m[i].regno + m[i].name);

        }

    }
}