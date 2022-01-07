import java.util.*;

class TestDetails {
    protected float marks[][];

    TestDetails() {
        marks = null;
    }

    public void storeMarks(float inMarks[][]) {
        marks = new float[inMarks.length][];
        for (int i = 0; i < inMarks.length; i++) {
            marks[i] = new float[inMarks[i].length];
            for (int j = 0; j < inMarks[i].length; j++)
                marks[i][j] = inMarks[i][j];
        }
    }

    public void displayMarks() {
        for (int i = 0; i < marks.length; i++) {
            System.out.print("\nStudent " + i + " : ");
            for (int j = 0; j < marks[i].length - 1; j++)
                System.out.print(marks[i][j] + ", ");
            System.out.print(marks[i][marks[i].length - 1]);
        }
        System.out.println();
    }
}

class NoticePeriod extends TestDetails {
    public void printBench() {
        System.out.print("Students ID who are on bench : ");
        int benchStudents = 0;
        int countAbove50;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i].length < 3) {
                benchStudents++;
                System.out.print(i + " ");
            } else {
                countAbove50 = 0;
                for (int j = 0; j < marks[i].length; j++) {
                    if (marks[i][j] >= 50)
                        countAbove50++;
                    if (countAbove50 >= 3)
                        break;
                }
                if (countAbove50 < 3) {
                    System.out.print(i + " ");
                    benchStudents++;
                }
            }
        }
        System.out.println("\nTotal Students on bench : " + benchStudents);
    }
}

public class Training {

    public static void main(String[] args)

    {

        NoticePeriod notice = new NoticePeriod();
        Scanner scan = new Scanner(System.in);
        System.out.println("enter no. of students less than 25");
        float marks[][] = new float[scan.nextInt()][];

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter the number of marks for Student-" + i + " (max 7 marks): ");
            int numMarks = scan.nextInt();
            marks[i] = new float[numMarks];
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print("Enter marks-" + (j + 1) + " : ");
                marks[i][j] = scan.nextFloat();

            }
        }
        notice.storeMarks(marks);
        notice.displayMarks();
        System.out.println();
        notice.printBench();
        scan.close();
    }

}