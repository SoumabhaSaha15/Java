package thread;

public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            System.out.println("Class:" + this.getClass().getSimpleName()+"\nThread name: "+Thread.currentThread().getName()+".\nIt is a thread class.");
            for (int i = 0; i <= 10; i++) {
                System.out.println("Thread name: " + Thread.currentThread().getName() + " iteration: " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
