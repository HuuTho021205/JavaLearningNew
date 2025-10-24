package Ngay5_OOP.Polymorphism;
/*Tạo lớp cha Shape:
Có một phương thức public void draw() in ra "Drawing a generic shape.".
Có một phương thức public double getArea() trả về 0.0.
Tạo các lớp con kế thừa từ Shape:
Circle: Có thêm thuộc tính radius.
Ghi đè draw() để in ra "Drawing a circle.".
Ghi đè getArea() để trả về diện tích hình tròn (Math.PI * radius * radius).
Rectangle: Có thêm thuộc tính width và height.
Ghi đè draw() để in ra "Drawing a rectangle.".
Ghi đè getArea() để trả về diện tích hình chữ nhật (width * height).
Trong hàm main:
Hỏi người dùng muốn tạo bao nhiêu hình (n).
Tạo một mảng Shape[] drawingBoard = new Shape[n];.
Dùng vòng lặp for n lần:
Hỏi người dùng muốn vẽ "Hình tròn" (phím 1) hay "Hình chữ nhật" (phím 2).
Dựa vào lựa chọn, hỏi các thông tin cần thiết (bán kính, hoặc chiều rộng/cao).
Tạo đối tượng new Circle(...) hoặc new Rectangle(...) tương ứng và lưu vào mảng drawingBoard.
Sau khi nhập xong, duyệt qua mảng drawingBoard:
Với mỗi shape trong mảng, hãy gọi shape.draw() và in ra diện tích bằng shape.getArea()
(Thử thách thêm): Viết thêm một đoạn code để tìm ra hình có diện tích lớn nhất trong mảng.*/
public class Shape {
    public void draw(){
        System.out.println("Drawing a generic shape");
    }
    public double getArea(){
        return 0.0;
    }

}
