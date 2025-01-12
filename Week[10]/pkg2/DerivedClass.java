package pkg2;

import pkg1.BaseClass; // Import the class from pkg1

public class DerivedClass extends BaseClass {
  public void accessProtected() {
    // Accessing protected member of the parent class
    System.out.println("Accessing protected variable: " + protectedVariable);
    showProtectedVariable();
  }
}
