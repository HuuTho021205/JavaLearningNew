package Ngay5_OOP.Polymorphism;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.setWidth(width);
        this.setHeight(height);
    }
    public Rectangle(){}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width < 0){
            System.out.println("Chieu rong khong hop le");
            return;
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height < 0){
            System.out.println("Do dai khong hop le");
            return;
        }
        this.height = height;
    }
    @Override
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
    @Override
    public double getArea(){
        return width * height;
    }

}
