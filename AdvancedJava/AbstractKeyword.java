package AdvancedJava;

// Define an abstract class Car. Abstract classes cannot be instantiated, but they can have abstract methods and regular methods.
abstract class Car {
    // Abstract method 'drive()' - no implementation in this class, subclasses must provide one.
    public abstract void drive();
    
    // Abstract method 'fly()' - no implementation in this class, subclasses must provide one.
    public abstract void fly();

    // Regular method 'playMusic()' - this is already implemented in the Car class.
    public void playMusic() {
        System.out.println("Playing music");
    }
}

// Define an abstract subclass 'Thar' which extends Car.
// This class provides an implementation for the 'drive()' method but leaves 'fly()' abstract.
abstract class Thar extends Car {
    // Concrete implementation of the 'drive()' method in Thar
    public void drive() {
        System.out.println("Driving Thar");
    }
}

// Define a concrete subclass 'ModifiedThar' which extends Thar.
// This class must provide an implementation for the 'fly()' method since 'fly()' is still abstract in Thar.
class ModifiedThar extends Thar {
    // Concrete implementation of the 'fly()' method in ModifiedThar
    public void fly() {
        System.err.println("Flying Thar");
    }
}

// Main class where the program execution begins.
public class AbstractKeyword {
    
    public static void main(String[] args) {
        // Create an object of ModifiedThar using Car reference (Polymorphism).
        Car car = new ModifiedThar();  // ModifiedThar is a subclass of Car, so this is valid.

        // Call the 'drive()' method - The 'ModifiedThar' class provides an implementation of 'drive()'.
        car.drive();  // Output: Driving Thar

        // Call the 'playMusic()' method - This method is inherited from the Car class and does not need to be overridden.
        car.playMusic();  // Output: Playing music

        // Call the 'fly()' method - The 'ModifiedThar' class provides an implementation of 'fly()'.
        car.fly();  // Output: Flying Thar
    }
}
