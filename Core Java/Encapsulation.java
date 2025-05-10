// This class represents a Human with name and age
// It uses encapsulation to keep data safe (private variables + public getters/setters)
class Human {
    // Private fields: cannot be accessed directly from outside the class
    private String name;
    private int age;

    // Getter method to access the value of 'name'
    public String getName() {
        return name;
    }

    // Setter method to update the value of 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method to access the value of 'age'
    public int getAge() {
        return age;
    }

    // Setter method to update the value of 'age'
    public void setAge(int age) {
        this.age = age;
    }
}

// Main class to run the program
public class Encapsulation {
    public static void main(String[] args) {
        // Creating object of Human class
        Human obj = new Human();

        // Setting values using setter methods (not directly)
        obj.setName("Rupam");
        obj.setAge(20);

        // Getting values using getter methods and printing them
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
