// Interface 1
interface Vehicle {
    void start();
}

// Interface 2
interface Machine {
    void stop();
}

// Class implementing multiple interfaces
class Car implements Vehicle, Machine {
    // Implementing methods of both interfaces
    public void start() {
        System.out.println("Car is starting...");
    }

    public void stop() {
        System.out.println("Car is stopping...");
    }
}

// Main class
public class MultipleInheritanceExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.start();  // Method from Vehicle
        myCar.stop();   // Method from Machine
    }
}
