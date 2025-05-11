// Base class (Parent class)
// Contains basic calculator functions: addition and subtraction
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// Derived class (Child of Calculator)
// Inherits add() and sub() from Calculator
// Adds multiplication and division features
class AdvancedCalc extends Calculator {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}

// Further derived class (Child of AdvancedCalc)
// Inherits add, sub, mul, and div methods
// Adds power (exponent) functionality using Math.pow
class VeryAdvancedCalc extends AdvancedCalc {
    public Double power(int a, int b) {
        return Math.pow(a, b); // a raised to the power b
    }
}

// Main class to run the program
public class Inheritance {
    public static void main(String[] args) {
        
        // Creating object of the most advanced calculator
        VeryAdvancedCalc calc = new VeryAdvancedCalc();

        // Can access all methods from Calculator, AdvancedCalc, and VeryAdvancedCalc
        System.out.println(calc.add(2, 3));     // Output: 5
        System.out.println(calc.sub(6, 3));     // Output: 3
        System.out.println(calc.mul(2, 3));     // Output: 6
        System.out.println(calc.div(6, 3));     // Output: 2
        System.out.println(calc.power(2, 3));   // Output: 8.0
    }
}
