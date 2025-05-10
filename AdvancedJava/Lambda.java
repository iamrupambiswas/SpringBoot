package AdvancedJava;

@FunctionalInterface
interface A {
    void show();
}

public class Lambda {
    public static void main(String[] args) {
        
        A obj = () -> System.out.println("in show");
        obj.show();
    }
}
