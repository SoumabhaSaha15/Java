
abstract class Shape {

  abstract void draw();

  void commonMethod() {
    System.out.println("Shapes have area and perimeter");
  }
}

class Circle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Circle");
  }
}

class Rectangle extends Shape {

  @Override
  void draw() {
    System.out.println("Drawing a Rectangle");
  }
}

public class AbstractClassDemo {

  public static void main(String[] args) {
    Shape shape;
    shape = new Circle();
    shape.draw();
    shape.commonMethod();
    shape = new Rectangle();
    shape.draw();
    shape.commonMethod();
  }
}
