package thread;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    Thread t1 = new Thread(new HelloWorld());
    Thread t2 = new MyThread("my_thread");
    t1.setName("hello_world");
    t1.start();
    t2.start();
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread name: " + Thread.currentThread().getName() + " iteration: " + i);
      Thread.currentThread().sleep(((long) (Math.random() * 2000)));
      System.out.println("Is my_thread alive?? " + t2.isAlive());
      System.out.println("Is hello_world alive?? " + t1.isAlive());
    }
    t2.join();
    System.out.println("Is hello_world alive?? " + t1.isAlive());
    System.out.println("Is my_thread alive?? " + t2.isAlive());
    t1.join();
  }
}
