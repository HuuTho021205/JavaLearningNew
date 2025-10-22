👑 Bốn Trụ Cột Của OOP 👑
Tưởng tượng bạn đang chơi Lego. Thay vì mỗi lần xây xe lại phải tự làm từng bánh xe, từng cái cửa, bạn có sẵn các "khối" (bánh xe, cửa, động cơ) và chỉ việc lắp ráp chúng lại. OOP cũng vậy, nó giúp bạn tạo ra các "khối" code có thể tái sử dụng.

OOP có 4 tính chất chính, hay còn gọi là 4 trụ cột:

1. Tính Đóng Gói (Encapsulation) 🛡️
Ý tưởng: Che giấu những dữ liệu quan trọng bên trong một "khối" (gọi là Object), và chỉ cho phép tương tác với chúng thông qua các phương thức công khai (public methods) mà bạn cung cấp. Giống như bạn lái xe ô tô qua vô lăng, cần số (phương thức), chứ bạn không cần phải chui vào động cơ để chỉnh sửa (dữ liệu).

Trong Java: Chúng ta dùng các access modifiers (private, public...) và các phương thức getters/setters.


2. Tính Kế Thừa (Inheritance) 🧬
Ý tưởng: Cho phép một "khối" con (subclass) thừa hưởng lại các thuộc tính và phương thức của "khối" cha (superclass). Ví dụ: Chó và Mèo đều là ĐộngVật. Chúng đều được kế thừa khả năng "ăn", "ngủ" từ ĐộngVật, nhưng Chó thì có thêm hành động "sủa", còn Mèo thì "kêu".

Trong Java: Dùng từ khóa extends.



3. Tính Đa Hình (Polymorphism) 🎭
Ý tưởng: "Poly" là nhiều, "morph" là hình dạng. Đa hình có nghĩa là "nhiều hình dạng". Cùng một hành động nhưng các "khối" khác nhau sẽ thực hiện theo cách khác nhau. Ví dụ: Cùng là hành động makeSound(), nhưng con chó sẽ "sủa", con mèo sẽ "kêu", con vịt sẽ "quạc".

Trong Java: Thể hiện qua Overriding (ghi đè phương thức) và Overloading (nạp chồng phương thức).



4. Tính Trừu Tượng (Abstraction) 👻
Ý tưởng: Chỉ đưa ra các chức năng cần thiết và ẩn đi sự phức tạp bên trong. Giống như cái điều khiển TV, bạn chỉ cần biết nút "Tăng âm lượng" để làm gì, chứ không cần biết vi mạch bên trong nó hoạt động ra sao.

Trong Java: Dùng Abstract Class và Interface. Nó định nghĩa ra một "bộ khung" hành động mà các lớp con bắt buộc phải tuân theo.




Câu Hỏi Phỏng Vấn OOP Thường Gặp
Nhà tuyển dụng sẽ không chỉ hỏi định nghĩa, họ muốn xem bạn hiểu sâu đến đâu.

Câu hỏi chung:
OOP là gì? Kể tên 4 tính chất của nó.

Tip: Trả lời định nghĩa ngắn gọn, sau đó liệt kê 4 tính chất bằng cả tiếng Anh và tiếng Việt.

Lợi ích của OOP là gì?

Tip: Nhấn mạnh vào: Tái sử dụng code (kế thừa), dễ bảo trì và nâng cấp (đóng gói), code có cấu trúc rõ ràng, giảm độ phức tạp.

Câu hỏi về từng tính chất:
Tính đóng gói là gì? Làm sao để đạt được nó trong Java?

Tip: Nói về việc che giấu dữ liệu (private) và cung cấp public getters/setters.

Tính kế thừa là gì? Java có hỗ trợ đa kế thừa không?

Tip: Nói rõ Java không hỗ trợ đa kế thừa (một lớp con không thể extends nhiều lớp cha), nhưng có thể "giả lập" bằng cách implements nhiều Interface. Đây là câu hỏi bẫy kinh điển.

Tính đa hình là gì? Phân biệt Overloading và Overriding.

Overloading (Nạp chồng): Các phương thức cùng tên nhưng trong cùng một lớp, khác nhau về tham số (số lượng hoặc kiểu dữ liệu). Xảy ra lúc biên dịch (compile-time).

Overriding (Ghi đè): Phương thức ở lớp con có cùng tên, cùng tham số với phương thức ở lớp cha. Xảy ra lúc chạy (run-time).

Tính trừu tượng là gì? Khi nào dùng Abstract Class, khi nào dùng Interface?

Đây là câu hỏi quan trọng nhất dành cho Junior.

Dùng Abstract Class khi: Bạn muốn chia sẻ code chung (các phương thức đã được viết sẵn) cho các lớp con. Một lớp chỉ có thể extends 1 abstract class.

Dùng Interface khi: Bạn muốn định nghĩa một "hợp đồng" hay "bộ quy tắc" mà các lớp không liên quan có thể tuân theo. Một lớp có thể implements nhiều interface.