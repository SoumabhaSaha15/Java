import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReadByBufferedReader {

  public static Boolean isPrimeNumber(BufferedReader bufferedReader) throws Exception{
    System.out.print("enter number: ");
    int n = Integer.parseInt(bufferedReader.readLine());
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
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(isPrimeNumber(bufferedReader));
    System.out.println(isPrimeNumber(bufferedReader));
    System.out.println(isPrimeNumber(bufferedReader));
    bufferedReader.close();
  }
}
