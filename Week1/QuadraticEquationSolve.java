
public class QuadraticEquationSolve {

    public static void solve(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one real root:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The equation has two complex roots:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        System.out.println("Solving equation 5x^2 + 4x + 3 = 0");
        QuadraticEquationSolve.solve(5, 4, 3);
        System.out.println("Solving equation x^2 + 4x + 10 = 0");
        QuadraticEquationSolve.solve(1, 4, 4);
        System.out.println("Solving equation x^2 - 4x + 10 = 0");
        QuadraticEquationSolve.solve(1, -4, 4);

    }
}
