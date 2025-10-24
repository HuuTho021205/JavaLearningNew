package Ngay5_OOP.Polymorphism;

public class MainMathHelper {
    public static void main(String[] args) {
        MathHelper a = new MathHelper();
        int b =a.calculate(100,500);
        double c = a.calculate(100.0,500.0);
        int d = a.calculate(100,200,500);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
