class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class AdvancedCalc extends Calculator {
    public int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }
}

class VeryAdvancedCalc extends AdvancedCalc {
    public Double power(int a, int b){
        return Math.pow(a,b);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        VeryAdvancedCalc calc = new VeryAdvancedCalc();
        System.out.println(calc.add(2,3));
        System.out.println(calc.sub(6,3));
        System.out.println(calc.mul(2,3));
        System.out.println(calc.div(6,3));
        System.out.println(calc.power(2,3));
    }
}
