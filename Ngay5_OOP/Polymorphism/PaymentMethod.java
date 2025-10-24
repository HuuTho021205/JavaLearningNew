package Ngay5_OOP.Polymorphism;
/*Hệ thống thanh toán
Tạo lớp cha PaymentMethod:
Có một phương thức public void pay(double amount)
in ra: "Processing a generic payment...".
Tạo 2 lớp con kế thừa từ PaymentMethod:
CreditCard: Ghi đè (@Override) phương thức pay(double amount) để in ra: "Paying [số tiền] using Credit Card.".
PayPal: Ghi đè (@Override) phương thức pay(double amount) để in ra: "Paying [số tiền] using PayPal.".
Trong hàm main:
Tạo một mảng PaymentMethod[] methods = new PaymentMethod[2];.
Gán methods[0] = new CreditCard();.
Gán methods[1] = new PayPal();.
Dùng một vòng lặp for để duyệt qua mảng methods
và gọi phương thức pay(100.0) của từng phần tử. Quan sát kết quả khác nhau.*/
public class PaymentMethod {
    public void pay(double amount){
        System.out.println("Processing a generic payment...");
    }

}
