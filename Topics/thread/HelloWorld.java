package thread;

public class HelloWorld implements Runnable {

  @Override
  public void run() {
    try {
      System.out.println(this.getClass().getSimpleName() + " class is not a Thread.");
      long period = (long) (Math.random() * 5000);
      Thread.sleep(period);
    } catch (InterruptedException e) {
      System.out.println(e.getMessage());
    }
  }

}
