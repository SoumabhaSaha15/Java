// Base Class
class Car {
    public void vehicleType() {
        System.out.println("Vehicle Type: Car");
    }
}

// Derived Class 1 (inherits Car)
class Maruti extends Car {
    public void brand() {
        System.out.println("Brand: Maruti");
    }
}

// Derived Class 2 (inherits Maruti)
class Alto extends Maruti {
    public void model() {
        System.out.println("Model: Alto");
    }

    public void speed() {
        System.out.println("Max Speed: 120 km/h");
    }
}

// Main Class to test the implementation
public class MultilevelInheritance {
    public static void main(String[] args) {
        // Creating an object of Alto
        Alto myAlto = new Alto();

        // Accessing methods from all three levels
        myAlto.vehicleType(); // From Car
        myAlto.brand();       // From Maruti
        myAlto.model();       // From Alto
        myAlto.speed();       // From Alto
    }
}
