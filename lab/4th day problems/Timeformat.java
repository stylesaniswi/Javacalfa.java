
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Timeformat {
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("HH");
    DateTimeFormatter t2 = DateTimeFormatter.ofPattern("mm");
    DateTimeFormatter t3 = DateTimeFormatter.ofPattern("ss");
    String hrs = date.format(t1);
    String mins = date.format(t2);
    String sec = date.format(t3);

    Timeformat(int n) {
        System.out.println("HH:mm:ss = " + hrs + ":" + mins + ":" + sec);
    }

    Timeformat() {
        int Hour = Integer.parseInt(hrs);
        int Minute = Integer.parseInt(mins);
        int Second = Integer.parseInt(sec);
        if (Hour > 12) {
            Hour = Hour - 12;
        }
        System.out.println("HH:mm:ss = " + Hour + ":" + Minute + ":" + Second);
    }

    public static void main(String args[]) {
        System.out.print("Time in 24 hour format: ");
        Timeformat hrs = new Timeformat(1);
        System.out.print("Time in 12 hour format: ");
        Timeformat completetime = new Timeformat();
    }

}