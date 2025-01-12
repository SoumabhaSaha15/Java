public class FinallyExample {
  public static void main(String[] args) {
    try {
      System.out.println("Inside try block.");
      int result = 10 / 0; // This will cause ArithmeticException
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    } finally {
      System.out.println("This is the finally block. It always executes.");
    }

    try {
      System.out.println("\nInside second try block.");
      int[] arr = { 1, 2, 3 };
      System.out.println(arr[2]); // Valid access
    } finally {
      System.out.println("Finally block after second try block.");
    }
  }
}
