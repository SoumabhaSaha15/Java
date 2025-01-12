import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadByScanner {

  public static Boolean isPrimeNumber(Scanner scanner) {
    System.out.print("enter number: ");
    int n = scanner.nextInt();
    if (n <= 1)
      return false;
    if (n == 2)
      return true;
    for (int i = 2; i <= Math.sqrt(n); i++)
      if (n % i == 0)
        return false;
    return true;
  }

  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println(isPrimeNumber(scanner));
    System.out.println(isPrimeNumber(scanner));
    System.out.println(isPrimeNumber(scanner));
    scanner.close();
  }
}
