// Abstract class
abstract class Shape {
    // Abstract method (must be implemented by subclasses)
    abstract void draw();

    // Final method (cannot be overridden by subclasses)
    public final void displayInfo() {
        System.out.println("This is a shape. Final method cannot be overridden.");
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }
}

// Subclass 2
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle...");
    }
}

// Main class
public class AbstractFinalExample {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();          // Calls overridden method
        circle.displayInfo();   // Calls final method

        Shape rectangle = new Rectangle();
        rectangle.draw();       // Calls overridden method
        rectangle.displayInfo();// Calls final method
    }
}
