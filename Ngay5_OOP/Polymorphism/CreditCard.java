package Ngay5_OOP.Polymorphism;

public class CreditCard extends PaymentMethod{
    @Override
    public void pay(double amount){
        System.out.println("Paying "+amount +" using Credit Card");
    }
}
