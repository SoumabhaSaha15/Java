
public class Factorial {

  public static long getFactorial(int number) {
    if (number < 0) {
      System.out.println("invalid input!!!");
      return -1;
    } else if (number == 1 || number == 0) return 1;
    else {
      long result = 1;
      for (int i = 2; i <= number; i++) result *= i;
      return result;
    }
  }

  public static void main(String[] args) {
    System.out.println("Factorial of 8 is " + Factorial.getFactorial(8));
    System.out.println("Factorial of 1 is " + Factorial.getFactorial(1));
    System.out.println("Factorial of -2 is " + Factorial.getFactorial(-2));
  }
}
