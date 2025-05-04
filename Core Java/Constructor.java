class Human1 {
    private String name;
    private int age;

    public Human1() {
        System.out.println("Constructor called");
        age = 12;
        name = "Rupam";
    }

    public Human1(int a, String b) {
        System.out.println("Parameterized Constructor called");
        age = a;
        name = b;
    }

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

public class Constructor {
    public static void main(String[] args) {
        Human1 obj = new Human1();
        System.out.println(obj.getName() + " : " + obj.getAge());
        Human1 obj1 = new Human1(21, "Biswas");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
    }
}
