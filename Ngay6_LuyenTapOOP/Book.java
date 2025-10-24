package Ngay6_LuyenTapOOP;
/*Tạo class Book:
Đóng gói (Encapsulation): Có các thuộc tính private: String title, String author, boolean isBorrowed.
        Tạo constructor, getters, và setters. isBorrowed mặc định là false.
Tạo class Library:
Có một thuộc tính private: ArrayList<Book> books để lưu danh sách các quyển sách.
Tương tác đối tượng: Viết các phương thức public:
void addBook(Book book): Thêm một quyển sách mới vào thư viện.
void borrowBook(String title): Tìm sách theo tên. Nếu sách tồn tại và chưa được mượn, đổi isBorrowed thành true. Ngược lại, thông báo lỗi.
void returnBook(String title): Tìm sách theo tên. Nếu sách tồn tại và đang được mượn, đổi isBorrowed thành false. Ngược lại, thông báo lỗi.
void displayAllBooks(): In ra thông tin của tất cả sách trong thư viện, kèm theo trạng thái "Đã mượn" hoặc "Có sẵn".
Trong hàm main:
Tạo một đối tượng Library.
Tạo vài đối tượng Book và thêm chúng vào thư viện.
Mô phỏng các hành động: mượn một quyển sách thành công, mượn lại chính quyển đó (sẽ báo lỗi), trả sách, và cuối cùng là hiển thị toàn bộ danh sách.*/
public class Book {
    private String title;
    private String author;
    private boolean isBorrowed = false;

    public Book(){}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
