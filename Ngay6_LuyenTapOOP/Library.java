package Ngay6_LuyenTapOOP;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Da them sach vao thu vien");
    }

    public void borrowBook(String title) {
        for (Book a : books) {
            if (a.getTitle().equalsIgnoreCase(title)) {
                if (a.isBorrowed() == false) {
                    a.setBorrowed(true);
                    System.out.println("Day la sach can tim: " + a.getTitle() + " Tac gia: " + a.getAuthor());
                } else {
                    System.out.println("Sach da duoc muon");
                }
                return;
            }
        }
        System.out.println("Khong tim thay sach co tieu de " + title);
    }

    public void returnBook(String title) {
        for (Book a : books) {
            if (a.getTitle().equalsIgnoreCase(title)) {
                if (a.isBorrowed() == true) {
                    System.out.println("Tra sach thanh cong");
                    a.setBorrowed(false);
                } else {
                    System.out.println("Sach da nhan khong can tra");
                }
                return;
            }

        }
        System.out.println("Khong tim thay sach trong thu vien");
    }

    public void displayAllBooks() {
        if(this.books.isEmpty()){
            System.out.println("Thu vien chua co sach nao");
            return;
        }
        for (Book a : books) {
            System.out.println("Ten: " + a.getTitle());
            System.out.println("Tac gia: " + a.getAuthor());
            if (a.isBorrowed() == true) {
                System.out.println("Trang thai: Da muon");
            } else {
                System.out.println("Trang thai: Co san");
            }
        }
    }
}

