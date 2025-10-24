package Ngay5_OOP.Abstract;

public class SmartPhone extends Device implements Rechargeable{
    public SmartPhone(){}
    public SmartPhone(String brand){
        super(brand);
    }
    @Override
    public void displayStatus(){
        System.out.println("Showing home screen");
    }

    @Override
    public void charge() {
        System.out.println("Smartphone is charging...");
    }

}
