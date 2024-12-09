class GoodMorningThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("GOOD MORNING");
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("GoodMorningThread interrupted");
        }
    }
}

class HelloThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("HELLO");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("HelloThread interrupted");
        }
    }
}

class WelcomeThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("WELCOME");
                Thread.sleep(3000); // Sleep for 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("WelcomeThread interrupted");
        }
    }
}

public class MultiThreadExample {
    public static void main(String[] args) {
        // Create threads
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
