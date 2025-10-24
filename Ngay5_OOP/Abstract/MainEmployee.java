package Ngay5_OOP.Abstract;

public class MainEmployee {
    public static void main(String[] args) {
        FullTimeEmployee a = new FullTimeEmployee("Huu Tho",100,20);
        PartTimeEmployee b = new PartTimeEmployee("Tho Huu",150,5,1.2);
        a.displayInfo();
        b.displayInfo();
        double s1 = a.calculateSalary();
        double s2 = b.calculateSalary();
        System.out.println(s1);
        System.out.println(s2);
    }
}
