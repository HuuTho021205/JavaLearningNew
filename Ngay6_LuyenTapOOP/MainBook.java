package Ngay6_LuyenTapOOP;

import java.util.Scanner;

public class MainBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library a = new Library();
        Book b = new Book("IT","aaa");
        Book c = new Book("haha","bb");
        Book d = new Book("hh","c");
        Book e = new Book("hut","abc");
        a.addBook(b);
        a.addBook(c);
        a.addBook(d);
        a.addBook(e);
        System.out.println("Nhap ten sach ban muon muon: ");
        String name = sc.nextLine();
        a.borrowBook(name);
//        System.out.println("Nhap ten sach ban muon tra: ");
//        String name1= sc.nextLine();
//        a.returnBook(name1);
        System.out.println("Danh sach sach co trong thu vien: ");
        a.displayAllBooks();
    }
}
