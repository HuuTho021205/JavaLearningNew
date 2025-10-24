package Ngay5_OOP.Polymorphism;
/*Tạo một class MathHelper:
Bên trong class này, hãy tạo các phương thức cùng tên là calculate nhưng có tham số khác nhau:
public int calculate(int a, int b): Trả về tổng của a và b.
public int calculate(int a, int b, int c): Trả về tổng của a, b, và c.
public double calculate(double a, double b): Trả về tích của a và b.
Trong hàm main:
Tạo một đối tượng MathHelper.
Gọi cả 3 phương thức calculate trên với các giá trị khác nhau và in kết quả ra.
Quan sát xem Java đã tự động chọn đúng phương thức dựa trên tham số bạn truyền vào như thế nào.*/
public class MathHelper {
    public int calculate( int a, int b){
        return a + b;
    }
    public int calculate( int a, int b, int c){
        return a + b + c;
    }
    public double calculate( double a, double b){
        return a + b;
    }

}
