public class ExceptionExample {
  public static void main(String[] args) {
    // ArithmeticException example
    try {
      int result = 10 / 0; // Division by zero
      System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
      System.out.println("Caught ArithmeticException: " + e.getMessage());
    }

    // ArrayIndexOutOfBoundsException example
    try {
      int[] arr = { 1, 2, 3 };
      System.out.println(arr[5]); // Accessing invalid index
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
    }
  }
}
