
public class Voting extends Thread {
    static int total = 240, ac = 0, bc = 0, cc = 0;

    synchronized void takeVote(int val) {
        if (total > 0) {
            total--;
            if (val == 1) {
                ac++;
            } else if (val == 2) {
                bc++;
            } else if (val == 3) {
                cc++;
            }
        }
        try {
            Thread.sleep(20);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Voting obj = new Voting();
        Thread t1 = new Thread() {
            public void run() {
                while (total > 0) {
                    obj.takeVote(1);
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                while (total > 0) {
                    obj.takeVote(2);
                }
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                while (total > 0) {
                    obj.takeVote(3);
                }
            }
        };

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (Exception e) {

        }

        System.out.println("Votes for A are: " + ac);
        System.out.println("Votes for B are: " + bc);
        System.out.println("Votes for C are: " + cc);
        System.out.print("The winner is: ");

        if (ac > bc && ac > cc) {
            System.out.println("A");
        } else if (bc > ac && bc > cc) {
            System.out.println("B");
        } else if (cc > ac && cc > bc) {
            System.out.println("C");
        } else {
            System.out.println("Tie");
        }
    }
}
