interface Area {
    double calculateArea(); // Abstract method to calculate area
}
class Rectangle implements Area {
    private double length;
    private double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth;
    }
}
class Circle implements Area {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaDemo {
    public static void main(String[] args) {
        Area rectangle = new Rectangle(5, 10);
        Area circle = new Circle(7);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}
