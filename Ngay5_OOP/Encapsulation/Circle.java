package Ngay5_OOP.Encapsulation;

public class Circle extends Shape{
    private double radius;
    public Circle(){}

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Ban kinh: " + radius);
        System.out.println("Dien tich: " + radius*radius*Math.PI);
    };

}
