package Ngay5_OOP.Polymorphism;

public class Circle extends Shape{
    private double radius;
    public Circle(){}

    public Circle(double radius) {
        this.setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if( radius < 0){
            System.out.println("Ban kinh khong hop le");
            return;
        }
        this.radius = radius;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
    @Override
    public double getArea(){
        return radius * radius * Math.PI;
    }
}
