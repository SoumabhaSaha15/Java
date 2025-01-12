class Counter {
  static private int count = 0;

  Counter() {
    count++;
  }

  static void displayCount() {
    System.out.println("Total instances: " + count);
  }
}

public class Static {
  public static void main(String[] args) {
    new Counter();
    new Counter();
    new Counter();
    new Counter();
    new Counter();
    new Counter();
    new Counter();
    Counter.displayCount();
  }
}
