class MorningGreeting extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("GOOD MORNING");
                Thread.sleep(1000); // Sleep for 1 second
            }
        } catch (InterruptedException e) {
            System.out.println("MorningGreeting interrupted");
        }
    }
}

class FriendlyHello extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("HELLO");
                Thread.sleep(2000); // Sleep for 2 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("FriendlyHello interrupted");
        }
    }
}

class WarmWelcome extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("WELCOME");
                Thread.sleep(3000); // Sleep for 3 seconds
            }
        } catch (InterruptedException e) {
            System.out.println("WarmWelcome interrupted");
        }
    }
}

public class ThreadPriorityExample {
    public static void main(String[] args) {
        // Create threads with new names
        MorningGreeting morning = new MorningGreeting();
        FriendlyHello hello = new FriendlyHello();
        WarmWelcome welcome = new WarmWelcome();

        // Set priorities
        morning.setPriority(Thread.MAX_PRIORITY); // Highest priority
        hello.setPriority(Thread.NORM_PRIORITY);  // Medium priority
        welcome.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        // Start threads
        morning.start();
        hello.start();
        welcome.start();
    }
}
