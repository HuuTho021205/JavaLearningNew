package Ngay5_OOP.Encapsulation;

public class Car extends Vehical{
    private int numberOfSeats;

    public Car(){}

    public Car(String brand, int year, double price, int numberOfSeats) {
        super(brand, year, price);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("So cho ngoi: " + numberOfSeats);
    }

}
