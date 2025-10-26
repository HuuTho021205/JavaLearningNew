package Ngay6_LuyenTapOOP;
/*Tạo abstract class Product:
Trừu tượng (Abstraction): Có các thuộc tính protected String name, protected double price.
Có một phương thức trừu tượng public abstract String description();.
Tạo các lớp con kế thừa Product:
Drink: Có thêm thuộc tính int volume (ml). Ghi đè description() để trả về chuỗi mô tả
bao gồm cả dung tích.
Snack: Có thêm thuộc tính int weight (g). Ghi đè description() để trả về chuỗi mô tả
bao gồm cả cân nặng.
Tạo class VendingMachine:
Đóng gói (Encapsulation): Có các thuộc tính private: ArrayList<Product> products và double currentBalance.
Đa hình (Polymorphism): Viết các phương thức public:
void addProduct(Product product): Thêm một sản phẩm vào máy.
void displayProducts(): Duyệt qua danh sách và in ra tên, giá, và mô tả của từng sản phẩm.
void insertMoney(double amount): Tăng currentBalance lên.
void purchaseProduct(String productName): Đây là logic cốt lõi.
Tìm sản phẩm theo tên.
Kiểm tra xem currentBalance có đủ để mua không.
        Nếu đủ, trừ tiền, thông báo giao dịch thành công và trả lại tiền thừa (change).
Xóa sản phẩm đó khỏi máy.
Nếu không đủ, thông báo lỗi.
Trong hàm main:
Tạo một VendingMachine.
Thêm vào đó vài Drink và Snack.
Mô phỏng một người dùng: xem danh sách, bỏ tiền vào, mua một món hàng thành công,
thử mua một món hàng quá đắt.*/
public abstract class Product {
    private String name;
    private double price;

    public Product(){}

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String description();
}
