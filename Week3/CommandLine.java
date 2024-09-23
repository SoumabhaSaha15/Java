
public class CommandLine {

    public static class Circle {

        double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        double getPerimeter() {
            return 2 * Math.PI * radius;
        }
    }

    public static class Rectangle {

        double length, width;

        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        public double getPerimeter() {
            return 2 * (length + width);
        }
    }

    public static class Square {

        double side;

        public Square(double side) {
            this.side = side;
        }

        public double getPerimeter() {
            return 4 * side;
        }
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide radius of Circle, length and width of Rectangle, and side of Square.");
            return;
        }

        double circleRadius = Double.parseDouble(args[0]);
        double rectLength = Double.parseDouble(args[1]);
        double rectWidth = Double.parseDouble(args[2]);
        double squareSide = Double.parseDouble(args[3]);

        Circle circle = new Circle(circleRadius);
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(rectLength, rectWidth);
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());

        Square square = new Square(squareSide);
        System.out.println("Perimeter of Square: " + square.getPerimeter());
    }
}
