// A class named Human1 to store name and age of a person
class Human1 {
    // Private variables - accessible only within this class
    private String name;
    private int age;

    // Default constructor (no parameters) - runs when we create object without arguments
    public Human1() {
        System.out.println("Constructor called");
        age = 12;             // setting default age
        name = "Rupam";       // setting default name
    }

    // Parameterized constructor - runs when we pass values while creating object
    public Human1(int a, String b) {
        System.out.println("Parameterized Constructor called");
        age = a;              // assigning passed age to age variable
        name = b;             // assigning passed name to name variable
    }

    // Getter method to access name
    public String getName() {
        return name;
    }

    // Setter method to update name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access age
    public int getAge() {
        return age;
    }

    // Setter method to update age
    public void setAge(int age) {
        this.age = age;
    }
}

// This is the main class where the program starts
public class Constructor {
    public static void main(String[] args) {
        // Creating object using default constructor
        Human1 obj = new Human1();
        // Printing default name and age
        System.out.println(obj.getName() + " : " + obj.getAge());

        // Creating object using parameterized constructor
        Human1 obj1 = new Human1(21, "Biswas");
        // Printing values passed through constructor
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
