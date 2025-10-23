package Ngay5_OOP.Encapsulation;
/*Hình học và super 🎨
Mục tiêu: Hiểu cách ghi đè phương thức (@Override) và cách gọi phương thức của lớp cha từ lớp con (super).
Tạo lớp cha Shape (Hình học):
Có thuộc tính private String color.
Có constructor và getters/setters.
Viết một phương thức public void showInfo() để in ra màu sắc, ví dụ: "Đây là một hình có màu: [màu sắc]".
Tạo lớp con Circle (Hình tròn) kế thừa từ Shape:
Thêm thuộc tính private double radius.
Tạo constructor và getters/setters.
        Ghi đè (@Override) phương thức showInfo():
Dòng đầu tiên, gọi phương thức của lớp cha để in ra màu sắc: super.showInfo();.
Các dòng tiếp theo, in ra thông tin riêng của hình tròn: bán kính và diện tích (PI * radius * radius).
Trong hàm main:
Tạo một đối tượng Circle với màu là "Đỏ" và bán kính là 5.0.
Gọi phương thức showInfo() của đối tượng Circle và xem kết quả.*/
public class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }
    public Shape(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showInfo(){
        System.out.println("Đây là hình có màu: " +"[" +color+ "]");
    }

}
