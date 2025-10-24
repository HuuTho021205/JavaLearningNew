package Ngay5_OOP.Polymorphism;

public class MainPM {
    public static void main(String[] args) {
        PaymentMethod [] pm = new PaymentMethod[2];
        pm[0] = new PayPal();
        pm[1] = new CreditCard();

        for (PaymentMethod a : pm){
            a.pay(100.0);
        }
    }
}
