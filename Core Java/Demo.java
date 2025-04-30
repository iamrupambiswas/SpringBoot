class Mobile {
    String brand;
    static String name;
    int price;

    public void show() {
        System.err.println(brand + " : " + name + " : " + price);
    }

    public static void show1(Mobile obj) {
        System.err.println(obj.brand + " : " + name + " : " + obj.price);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Samsung";
        Mobile.name = "M33 5G";
        obj1.price = 17000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.name = "iphone 15";
        obj2.price = 50000;

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
