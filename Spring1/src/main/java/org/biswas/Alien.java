package org.biswas;

public class Alien {

    int age;
    Computer com;

    public Alien() {
//        System.out.println("Object created!");
    }

    public Alien(int age, Laptop laptop) {
        this.age = age;
        this.com = laptop;
        System.out.println("Parameter constructor called!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        System.out.println("Setter called!");
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("coding");
        com.compile();
    }
}
