package thread;
public class Main {

    public static void main(String[] args) throws InterruptedException{
        HelloWorld hw = new HelloWorld();
        Thread t1 = new Thread(hw);
        t1.start();
        t1.join();
        System.out.println(Thread.currentThread().getName());
        MyThread t2=new MyThread("my_thread");
        t2.start();
        System.out.println(Thread.currentThread().getName());
        t2.join();
    }
}
