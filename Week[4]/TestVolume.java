
class Volume {

  public double calculateCubeVolume(double side) {
    return side * side * side;
  }

  public double calculateCylinderVolume(double radius, double height) {
    return Math.PI * radius * radius * height;
  }

  public double calculateSphereVolume(double radius) {
    return (4.0 / 3) * Math.PI * radius * radius * radius;
  }
}

public class TestVolume {

  public static void main(String[] args) {
    Volume vol = new Volume();
    System.out.println("Volume of Cube: " + vol.calculateCubeVolume(3)); // Side = 3
    System.out.println("Volume of Cylinder: " + vol.calculateCylinderVolume(2, 5)); // Radius = 2, Height = 5
    System.out.println("Volume of Sphere: " + vol.calculateSphereVolume(4)); // Radius = 4
  }
}
