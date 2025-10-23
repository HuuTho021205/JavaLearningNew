package Ngay5_OOP.Encapsulation;
/*Trong hàm main:
        Hỏi người dùng muốn quản lý bao nhiêu phương tiện (n).
        Tạo một mảng có thể chứa các phương tiện: Vehicle[] vehicleList = new Vehicle[n];.
        Dùng vòng lặp for n lần:
        Hỏi người dùng muốn nhập thông tin cho "Ô tô" (phím 1) hay "Xe máy" (phím 2).
        Dựa vào lựa chọn, yêu cầu người dùng nhập đầy đủ thông tin (cả chung và riêng).
        Tạo đối tượng Car hoặc Motorbike tương ứng và lưu vào mảng vehicleList.
        Sau khi nhập xong, duyệt qua mảng vehicleList và gọi phương thức showInfo()
        của từng phương tiện để hiển thị toàn bộ danh sách.*/
import java.util.Scanner;

public class MainVehical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phuong tien: ");
        int n = sc.nextInt();
        sc.nextLine();
        Vehical [] a = new Vehical[n];

        for (int i =0; i < n; i++){
            System.out.println("Nhap thong tin cho Oto (Phím 1) hay Xe máy (Phím 2) ?");
            int choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                Car c = new Car();
                System.out.println("Nhap vao hang xe: ");
                c.setBrand(sc.nextLine());
                System.out.println("Nhap vao nam san xuat: ");
                c.setYear(sc.nextInt());
                System.out.println("Nhap vao gia: ");
                c.setPrice(sc.nextDouble());
                System.out.println("Nhap vao so cho: ");
                c.setNumberOfSeats(sc.nextInt());
                a[i] = c;
            } else if (choice == 2) {
                Motorbike mb = new Motorbike();
                System.out.println("Nhap vao hang xe: ");
                mb.setBrand(sc.nextLine());
                System.out.println("Nhap vao nam san xuat: ");
                mb.setYear(sc.nextInt());
                System.out.println("Nhap vao gia: ");
                mb.setPrice(sc.nextDouble());
                System.out.println("Nhap vao dung tich xi lanh: ");
                mb.setEngineCapacity(sc.nextInt());
                a[i] = mb;
            }
            else {
                System.out.println("Lua chon khong hop le, vui long nhap lai!");
                i--; // TRICK: Giảm i đi 1 để vòng lặp lặp lại cho chính phương tiện này.
            }
        }
        System.out.println("Danh sach phuong tien: ");
        for ( Vehical vh : a){
            vh.showInfo();
        }

    }
}
