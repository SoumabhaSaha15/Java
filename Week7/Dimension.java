
class Dimension {

    public void calculateArea() {
        System.out.println("Calculating area...");
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 7);
        rect.calculateArea();
        Triangle tri = new Triangle(6, 8, 10);
        tri.calculateArea();
    }
}

class Rectangle extends Dimension {

    private double length,breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Dimension {

    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void calculateArea() {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("Area of Triangle: " + area);
    }
}
