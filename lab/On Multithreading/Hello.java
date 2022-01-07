class Hello extends Thread {
    public void run() {
        for (int j = 0; j < 30; j++) {
            System.out.println("Hello");
            try {
                sleep(1000);
            } catch (Exception e) {
                System.out.println("Hello");
            }
        }

    }
}

class vitthread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Welcome to VIT");
            try {
                sleep(3000);
            } catch (Exception e) {
                System.out.println("Welcome to VIT");
            }

        }
    }
}

class welcome {
    public static void main(String arg[]) {
        Hello thread1 = new Hello(); // thread 1 HELLO
        vitthread thread2 = new vitthread(); // thread 2 WELCOME TO VIT
        thread1.start(); // start thread 1
        thread2.start(); // start thread 2
    }
}
