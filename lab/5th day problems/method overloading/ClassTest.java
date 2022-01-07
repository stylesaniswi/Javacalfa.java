import java.util.*;

class MPL {
    int numberOfStudents;
    Integer[] marks = new Integer[10];
    int standard;
    int firstMark = -1;

    MPL(int standard, int numberOfStudents) {
        this.standard = standard;
        this.numberOfStudents = numberOfStudents;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for " + numberOfStudents + "students of class" + standard);
        for (int i = 0; i < numberOfStudents; ++i) {
            marks[i] = sc.nextInt();
            if (marks[i] > firstMark)
                firstMark = marks[i];
        }
    }

    float getAverage() {
        int sum = 0;
        for (int i = 0; i < numberOfStudents; ++i)
            sum += marks[i];
        return sum / numberOfStudents;
    }

}

public class ClassTest {

    public static void main(String args[]) {
        MPL[] m = new MPL[4];
        m[0] = new MPL(5, 6);
        m[1] = new MPL(10, 5);
        m[2] = new MPL(8, 4);
        m[3] = new MPL(7, 6);
        findBestClass(m);
        findBestClass(m, 1);
    }

    static void findBestClass(MPL[] m) {
        int max = 0;
        for (int i = 0; i < 4; ++i) {
            if (m[i].firstMark > m[max].firstMark)
                max = i;
        }
        System.out.println("Best Class = " + m[max].standard + " Mark = " + m[max].firstMark);
    }

    static void findBestClass(MPL[] m, int avg) {
        int max = 0;
        for (int i = 0; i < 4; ++i) {
            if (m[i].getAverage() > m[max].getAverage())
                max = i;
        }
        System.out.println("Best Average Class = " + m[max].standard + " Mark = " + m[max].getAverage());
    }
}