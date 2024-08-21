
public class Calculator {

    public static double add(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtract(double n1, double n2) {
        return n1 - n2;
    }

    public static double multiply(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        return n1 / n2;
    }

    public static void main(String[] args) {
        System.out.println("add 10 & 5-> " + Calculator.add(10, 5));
        System.out.println("subtract 10 & 5-> " + Calculator.subtract(10, 5));
        System.out.println("multiply 10 & 5-> " + Calculator.multiply(10, 5));
        System.out.println("divide 10 & 5-> " + Calculator.divide(10, 5));
    }
}
