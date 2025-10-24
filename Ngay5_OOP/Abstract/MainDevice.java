package Ngay5_OOP.Abstract;

public class MainDevice {
    public static void main(String[] args) {
        SmartPhone a = new SmartPhone();
        Television b = new Television();
        a.powerOn();
        a.displayStatus();
        a.charge();
        b.powerOn();
        b.displayStatus();

    }
}
