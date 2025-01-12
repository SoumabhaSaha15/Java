interface Area {
  double calculateArea();
}

class Rectangle implements Area {
  private final double length, breadth;

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
  private final double radius;

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
    System.out.println(String.format("Area of Circle: %.2f", circle.calculateArea()));
  }
}
