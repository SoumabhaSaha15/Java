
public class OddEven {

  public static Boolean isOdd(Integer number) {
    return (number % 2 == 1);
  }

  public static Boolean isEven(Integer number) {
    return !OddEven.isOdd(number);
  }

  public static void main(String[] args) {
    System.out.println("Number 8 is odd ,true or false?\nAns)\t" + OddEven.isOdd(8));
    System.out.println("Number 9 is odd ,true or false?\nAns)\t" + OddEven.isOdd(9));
  }
}
