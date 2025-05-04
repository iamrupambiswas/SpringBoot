class Human {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setName("Rupam");
        obj.setAge(20);

        System.err.println(obj.getName() + " : " + obj.getAge());
    }
}
