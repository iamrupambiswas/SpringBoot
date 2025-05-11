// Base class A with a method show()
class A {
    void show() {
        System.out.println("in A show");
    }
}

// Class B inherits from A and overrides the show() method
class B extends A {
    void show() {
        System.out.println("in B show");
    }
}

// Class C inherits from B and also overrides the show() method
class C extends B {
    void show() {
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating object of class A
        A obj = new A();
        obj.show(); // Output: in A show

        // obj now refers to object of class B (parent type, child object)
        obj = new B();
        obj.show(); // Output: in B show

        // obj now refers to object of class C
        obj = new C();
        obj.show(); // Output: in C show
    }
}
