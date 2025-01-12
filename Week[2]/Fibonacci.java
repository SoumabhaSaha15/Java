
public class Fibonacci {

  public static void printFibonacciSeries(int number) {
    int num1 = 0, num2 = 1;
    System.out.println("Fibonacci Series till " + number + " terms:");
    for (int i = 0; i < number; i++) {
      System.out.print(num1 + " ");
      int num3 = num1 + num2;
      num1 = num2;
      num2 = num3;
    }
  }

  public static void main(String[] args) {
    Fibonacci.printFibonacciSeries(10);
  }
}
