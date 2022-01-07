import java.util.*;

class Rect {
    double height, width;

    Rect() {
        height = 1;
        width = 1;
    }

    Rect(double h, double w) {
        height = h;
        width = w;
    }

    void dispHW() {
        System.out.println("The height and width of rectange is: " + height + "," + width);
    }

    void getArea() {
        System.out.println("The area of rectangle is: " + height * width);
    }

    void getPerimenter() {
        System.out.println("The Perimeter of rectangle is: " + 2 * (height + width));
    }
}

public class Rectangle {
    public static void main(String[] args) {
        Rect R1 = new Rect();
        R1.dispHW();
        R1.getArea();
        R1.getPerimenter();
        System.out.println(" ");
        Scanner val = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter height and width of rectangle");
            double H = val.nextDouble();
            double W = val.nextDouble();
            Rect R2 = new Rect(H, W);

            // printing area and perimeter
            R2.dispHW();
            R2.getArea();
            R2.getPerimenter();
            System.out.println(" ");
        }

    }
}
