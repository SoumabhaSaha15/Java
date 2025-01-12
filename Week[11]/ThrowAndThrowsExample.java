
class ThrowAndThrowsExample {

  public static void validateAge(int age) throws IllegalArgumentException {
    if (age < 18) {
      throw new IllegalArgumentException("Age must be 18 or above."); // Explicitly throwing an exception
    } else {
      System.out.println("Age is valid.");
    }
  }

  public static void main(String[] args) {
    try {
      validateAge(16); // This will throw an exception
    } catch (IllegalArgumentException e) {
      System.out.println("Caught Exception: " + e.getMessage());
    }

    try {
      validateAge(20); // This is valid
    } catch (IllegalArgumentException e) {
      System.out.println("Caught Exception: " + e.getMessage());
    }
  }
}
