package AdvancedJava;

/*
===============================
     🔑 INTERFACES IN JAVA
===============================

🧠 THINGS YOU NEED TO KNOW:

1. **Interface**:
   - A blueprint of a class that contains only abstract methods (before Java 8).
   - From Java 8 onward, interfaces can have default and static methods as well.

2. **Interface Fields**:
   - All variables declared in an interface are by default:
     👉 `public static final` (i.e., constants)

3. **Interface Methods**:
   - All methods are by default:
     👉 `public abstract` (i.e., no body unless declared `default` or `static`)

4. **Implementation**:
   - A class uses `implements` to implement an interface.
   - It must provide implementations for **all abstract methods** of the interface.

5. **Polymorphism**:
   - You can refer to an object using the interface type, enabling dynamic method binding (run-time polymorphism).

*/

// Define an interface 'A'
interface A {

    // These are public static final by default (constants)
    String name = "Rupam Biswas";
    int age = 21;

    // Abstract methods (no body)
    void show();
    void config();
}

// Class B implements interface A
class B implements A {

    // Providing implementation of 'show()' method
    public void show() {
        System.out.println("in show");
    }

    // Providing implementation of 'config()' method
    public void config() {
        System.out.println("in config");
    }
}

// Main class
public class Interface {

    public static void main(String[] args) {
        
        // Declare a reference of interface type A
        A obj;

        // Create object of class B and assign it to interface reference (polymorphism)
        obj = new B();

        // Call implemented methods using interface reference
        obj.show();     // Output: in show
        obj.config();   // Output: in config

        // Access interface constants using interface name
        System.out.println(A.name);  // Output: Rupam Biswas
        System.out.println(A.age);   // Output: 21
    }
}
