package Ngay5_OOP.Abstract;

public class Television extends Device{
    public Television(){}
    public Television(String brand){
        super(brand);
    }
    @Override
    public void displayStatus(){
        System.out.println("Displaying TV channels");
    }

}
