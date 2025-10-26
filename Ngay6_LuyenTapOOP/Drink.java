package Ngay6_LuyenTapOOP;

public class Drink extends Product{
    private int volume;

    public Drink() {
    }

    public Drink(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String description(){
        return "Ten san pham: " + getName() +"\n"
                +"Gia san pham: " + getPrice() +"\n"
                +"Dung tich (ml): " + volume;

    }

}
