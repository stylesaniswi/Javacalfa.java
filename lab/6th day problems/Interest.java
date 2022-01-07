import java.util.*;

abstract class Special {
    abstract double process(double P, double R);
}

class Discount extends Special {
    double process(double P, double R) {
        double net = P - ((P * R) / 100);
        System.out.println("The net value is: " + net);
        return net;
    }
}

class Total extends Special {
    double process(double P, double R) {
        double total = P + ((P * R) / 100);
        System.out.println("The total value is: " + total);
        return total;
    }
}

public class Interest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of P and R");
        double P = s.nextDouble();
        double R = s.nextDouble();
        Special s1 = new Discount();
        s1.process(P, R);
        Special s2 = new Total();
        s2.process(P, R);
        s.close();
    }
}
