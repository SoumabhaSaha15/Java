
interface Engine {

  void startEngine();
}

interface Horn {

  void honk();
}

class Car implements Engine, Horn {

  @Override
  public void startEngine() {
    System.out.println("Engine started");
  }

  @Override
  public void honk() {
    System.out.println("Car is honking");
  }
}

public class MultipleInheritance {

  public static void main(String[] args) {
    Car myCar = new Car();
    myCar.startEngine();
    myCar.honk();
  }
}
