package Ngay5_OOP.Encapsulation;
/*Quản lý Phương tiện Giao thông 🚗🏍️
Mục tiêu: Kết hợp Kế thừa, Mảng, và Nhập liệu từ người dùng.
Đây là bài toán mô phỏng một ứng dụng thực tế nhỏ.
Tạo lớp cha Vehicle (Phương tiện):
Thuộc tính private: String brand (hãng sản xuất), int year (năm sản xuất), double price (giá).
Tạo constructor và getters/setters.
Tạo phương thức showInfo() để in ra các thông tin chung này.
Tạo lớp con Car kế thừa từ Vehicle:
Thuộc tính private riêng: int numberOfSeats (số chỗ ngồi).
Ghi đè (@Override) phương thức showInfo() để in thêm số chỗ ngồi.
Tạo lớp con Motorbike kế thừa từ Vehicle:
Thuộc tính private riêng: int engineCapacity (dung tích xi lanh - cc).
Ghi đè (@Override) phương thức showInfo() để in thêm dung tích xi lanh.
Trong hàm main:
Hỏi người dùng muốn quản lý bao nhiêu phương tiện (n).
Tạo một mảng có thể chứa các phương tiện: Vehicle[] vehicleList = new Vehicle[n];.
Dùng vòng lặp for n lần:
Hỏi người dùng muốn nhập thông tin cho "Ô tô" (phím 1) hay "Xe máy" (phím 2).
Dựa vào lựa chọn, yêu cầu người dùng nhập đầy đủ thông tin (cả chung và riêng).
Tạo đối tượng Car hoặc Motorbike tương ứng và lưu vào mảng vehicleList.
Sau khi nhập xong, duyệt qua mảng vehicleList và gọi phương thức showInfo()
của từng phương tiện để hiển thị toàn bộ danh sách.*/
public class Vehical {
    private String brand;
    private int year;
    private double price;

    public Vehical(){}

    public Vehical(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void showInfo(){
        System.out.println("Hang san xuat: " + brand);
        System.out.println("Nam san xuat: " + year);
        System.out.println("Gia: " + price);
    }
}
