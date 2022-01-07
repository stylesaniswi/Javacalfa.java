import java.lang.Math;

class OverloadArea {
    void area(float s) {
        System.out.println("the area of the square is " + Math.pow(s, 2) + " sq units");
    }

    void area(float h, float b) {
        System.out.println("the area of the rectangle is " + h * b + " sq units");
    }

    void area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = s * (s - a) * (s - b) * (s - c);
        double Z = Math.sqrt(ar);
        System.out.println("the area of the triagle with 3 sides is " + Z + " sq units");
    }
}

public class AreaOfShapes {

    public static void main(String[] args) {
        OverloadArea ob = new OverloadArea();
        ob.area(5);
        ob.area(11, 12);
        ob.area(3, 6, 7);
    }
}
