package AdvancedJava;

enum Status{
    Running, Failed, Pending, Success
}

public class Enum {
    public static void main(String[] args) {
        Status[] s = Status.values();
        for(Status ss: s) {
            System.out.println(ss + " : " + ss.ordinal());
        }
    }
}
