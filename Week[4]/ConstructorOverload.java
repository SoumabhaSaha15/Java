
class VolumeOverload {

  private final double volume;

  public VolumeOverload(double side) {
    this.volume = side * side * side;
  }

  public VolumeOverload(double radius, double height) {
    this.volume = Math.PI * radius * radius * height;
  }

  public VolumeOverload(double radius, boolean isSphere) {
    this.volume = (4.0 / 3) * Math.PI * radius * radius * radius;
  }

  public double getVolume() {
    return volume;
  }
}

public class ConstructorOverload {

  public static void main(String[] args) {
    VolumeOverload cube = new VolumeOverload(3);
    System.out.println("Volume of Cube: " + cube.getVolume());

    VolumeOverload cylinder = new VolumeOverload(2, 5);
    System.out.println("Volume of Cylinder: " + cylinder.getVolume());

    VolumeOverload sphere = new VolumeOverload(4, true);
    System.out.println("Volume of Sphere: " + sphere.getVolume());
  }
}
