package Ngay10_Multithreading;

public class MainThread {
    public static void main(String[] args) {
        MyRunable runable = new MyRunable();
        Thread work1 = new Thread();
        Thread work2 = new Thread(runable);
        System.out.println("Chạy luồng");
        work1.start();
        work2.start();
    }
}
