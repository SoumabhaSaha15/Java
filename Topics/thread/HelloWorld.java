package thread;

public class HelloWorld implements Runnable {

    @Override
    public void run() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("from:run method");
    }

}