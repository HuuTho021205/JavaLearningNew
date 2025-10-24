package Ngay5_OOP.Abstract;
/*Tạo một abstract class Device:
        * - Có thuộc tính protected String brand.
        * - Có một phương thức ĐÃ CÓ CODE SẴN: public void powerOn() in ra "Device is powering on...".
        * - Có một phương thức TRỪU TƯỢNG: public abstract void displayStatus();.
        *
        * 2.  Tạo một interface Rechargeable (Có thể sạc lại):
        * - Có một phương thức trừu tượng void charge();.
        *
        * 3.  Tạo các lớp cụ thể:
        * - Television kế thừa từ Device:
        * - Ghi đè displayStatus() để in ra "Displaying TV channels.".
        * - Lớp này KHÔNG thể sạc lại.
        * - Smartphone kế thừa từ Device VÀ thực thi Rechargeable:
        * - Ghi đè displayStatus() để in ra "Showing home screen.".
        * - Bắt buộc phải định nghĩa phương thức charge() để in ra "Smartphone is charging...".
        *
        * 4.  Trong hàm main:
        * - Tạo một đối tượng Television và một Smartphone.
        * - Gọi powerOn() và displayStatus() của cả hai.
 * - Chỉ có Smartphone có thể gọi được phương thức charge(). Hãy thử gọi và xem kết quả.
 */
public abstract class Device {
    private String brand;
    public Device(){}
    public Device(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public void powerOn(){
        System.out.println("Device is powering on...");
    }
    public abstract void displayStatus();
}
