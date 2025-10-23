package Ngay5_OOP.Encapsulation;

public class Motorbike extends Vehical{
    private int engineCapacity;
    public Motorbike(){}

    public Motorbike(String brand, int year, double price, int engineCapacity) {
        super(brand, year, price);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Dung tich xi lanh: " + engineCapacity);
    }
}
