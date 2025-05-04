class A{
    void show(){
        System.out.println("in A show");
    }
}

class B extends A{
    void show(){
        System.out.println("in B show");
    }
}

class C extends B{
    void show(){
        System.out.println("in C show");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}
