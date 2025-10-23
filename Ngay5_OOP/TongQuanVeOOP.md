**OOP là gì ??**
OOP là cách chúng ta mô phỏng thế giới thực (real world) vào chương trình
(program) máy tính.
Tất cả các "đối tượng" tham gia vào chương trình chính là những thành phần chủ chốt.
Ví dụ với website hoidanit.com.vn (phân tích chức năng khóa học):
Các "đối tượng"/thành phần tạo lên website:
+ Danh sách khóa học
+ khóa học riêng lẻ

+ nội dung của khóa học : tiêu đề, giá cả...
+ giáo án của khóa học

=> OOP thiên hướng "mô phỏng" những điều bạn thấy (sử dụng) ở thế giới thực tế vào
thế giới programing (coding).


**Khái niệm Class và Object**
Để mô phỏng "real world", chúng ta cần các "đối tượng" (target)
Đối với 1 sinh vật/đồ vật trong thế giới thực, điều có điều miêu tả bởi 2 thứ:
- Đặc điểm (thuộc tính)
- Hành vi đặc trưng của nó
**Ví dụ:**
Miêu tả con sư tử: (sinh vật)
- Đặc điểm (thuộc tính):
+ Có lông
+ thuộc họ mèo
- Hành vi:
+ đi săn mồi
Miêu tả 1 bạn sinh viên: (sinh vật)
- Đặc điểm:
+ có mã số sinh viên
+ có địa chỉ sinh sống
+ có tên lớp học
- Hành vi:
+ ôn tủ cho qua môn
+ ngủ nướng qua ngày
+ xem youtube lấy kiến thức qua môn :v
Miêu tả 1 cái máy tính (đồ vật)
- Đặc điểm:
+ có dung lượng ổ cứng (SSD/HDD)
+ có dung lượng bộ nhớ (RAM)
- Hành vi:
+ có thể on/off/restart
=> Sử dụng "đối tượng" để mô hình hóa.
Tuy nhiên, chúng ta không "miêu chỉ chi tiết", chỉ miêu tả "đối tượng tổng quát" (đây gọi
là tính trừu tượng hóa/abstraction)

**Ví dụ**, thay vì miêu tả cụ thể sinh viên A, B, C, D ... chúng ta gọi chung là sinh viên:
Đối tượng tổng quát được gọi là Class (Lớp), còn mỗi sinh viên cụ thể gọi là Object (đối
tượng).
**Ví dụ:**
class SinhVien gồm:
- Thuộc tính (đặc điểm)
+ Tên
+ mã số sinh viên
- Hành vi:
+ ăn/ngủ/nghỉ/ôn thi
=> Để có tính tái sử dụng code cao, OOP chỉ "định nghĩa" lớp tổng quart. còn muốn có
chi tiết => chúng ta tự tạo ra
**Ví dụ,** để tạo ra sinh viên A thì:
+ gán Tên = A
+ gán mã số sinh viên = 1234
Tương tự, tạo ra sinh viên B thì:
+ gán Tên = B
+ gán mã số sinh = 6789
...

**Khái niệm**:
- Class chính là "đối tượng tổng quát" của real-word được mô phỏng
- Object là các thực tể chi tiết của class đấy (instance)

**Class Attributes (Thuộc tính của Class)**
Attributes/Fields là các biến dùng để thể hiện giá trị cho class
=> thường được khai báo bên trong class (đầu hàm)
- Không giới hạn số lượng thuộc tính của 1 class
- Để truy cập/sửa đổi => sử dụng object.attribute
- Tên thuộc tính là danh từ, và viết camelCase

**Class Method (Phương thức của class)**
# 1. Định nghĩa method thông thường

Method là cách tượng trưng cho hành động của object.
Tên method thường viết theo camelCase, và là các động từ (chỉ hành động)
Cú pháp:
<return_type> <method_name> ([parameters]) { //code}
<kiểu_trả_về> <tên_method> ([danh_sách_tham_số]) { //code}
ví dụ:
void getName(){
//
}
int getTuoi(){
///
}
- Với void => return "nothing"

# 2. Method Overloading (Nạp chồng phương thức)

- Chúng ta có thể định nghĩa các method với tên giống nhau (nhưng khác nhau về tham
số)
void method( ){ }
void method(int a){ }
void method(int a, String b){ }

**Định nghĩa hàm tạo (constructor)**
# 1. Constructor
Hàm tạo là một "method đặc biệt" dùng để tạo ra object
- Constructor "phải có tên giống với class", và không thể có "return type"
- Tất cả các class đều cần có "hàm tạo". Nếu bạn không tạo => java sẽ tự động tạo cho
bạn (không có tham số đầu vào)
Ví dụ:
public Student (String name, int age){
this.name = name;
this.age = age;
}
# 2. Keyword this
- Dùng để "tham chiếu" tới giá trị của instance/object hiện tại (tương tự con trỏ của C :v)
//tạo mới object với hàm tạo

**Access Modifier (private/public/protected)**
# 1. Khái niệm package
package === folder
=> được sử dụng để "gom nhóm" file lại với nhau => cho gọn gàng, dễ tái sử dụng
- Keyword import:
+ được sử dụng để import (tái sử dụng lại) các class đã được định nghĩa trong các
package
# 2. Access Modifier
Access Modifier : quyền truy cập sử dụng/sửa đổi
Trong java, có 4 thuộc tính hay dùng nhất:
- private: chỉ được sử dụng trong nội bộ class
- public : công khai hoàn toàn (100%)
- (default): là public đối với class trong cùng package. là private khi khác package
- protected: được sử dụng với lớp cha/con (tính chất kế thừa : sẽ đề cập sau)
=> public và private là 2 thuộc tính được sử dụng nhiều nhất
Mức độ che dấu tăng dần theo mũi tên:
public -> protected -> {default} -> private
# 3. Ví dụ về sử dụng access modifier
package p1;
public class P {
public int a;
int b;
protected int c;
private int d;
}

trường hợp 1: (cùng package)
package p1
public class P1 {
void f() {
P pObject = new P();
}
}
trường hợp 2: (khác package)
package p2
public class P2 {
void f() {
P pObject = new P();
}
}

trường hợp 3 (kế thừa):
package p3
public class P3 extends P {
void f() {
P1 pObject = new P1();
}
}

**Encapsulation**
Để tăng tính bảo mật cho dữ liệu, bạn cần:
- hạn chế quyền "modify" data
- che dấu data : public/private...
ví dụ:
public class Student {
public String name;
public int age;
}
public class MyClass{
main(){
Student a = new Student();
a.age = 1500; //gán sai dữ liệu
}
}
# 1. Sử dụng keyword private
thay vì public => sử dụng private
# 2. Getter
//
# 3. Setter

**Inheritance (Tính Kế Thừa) 🧬**
Để tái sử dụng code và tránh lặp lại, bạn cần:

Xây dựng một lớp "cha" chứa các thuộc tính và hành vi chung.

Cho các lớp "con" thừa hưởng những thứ đó.

Ví dụ (khi chưa có kế thừa):
public class Dog {
    public String name;
    public void eat() { //Hành vi này bị lặp lại
        System.out.println("Eating...");
    }
    public void bark() {
        System.out.println("Gau gau!");
    }
}
public class Cat {
    public String name;
    public void eat() { //Hành vi này bị lặp lại
        System.out.println("Eating...");
    }
    public void meow() {
        System.out.println("Meo meo!");
    }
}
# 1. Tạo lớp cha (Superclass) Tạo một lớp Animal chứa các đặc điểm chung.
public class Animal {
    public String name;
    public void eat() {
        System.out.println("Eating...");
    }
}
# 2. Sử dụng keyword extends Cho Dog và Cat kế thừa từ Animal. Chúng sẽ tự động có name và eat().
public class Dog extends Animal {
    // Không cần viết lại name và eat()
    public void bark() {
        System.out.println("Gau gau!");
    }
}
public class Cat extends Animal {
    // Không cần viết lại name và eat()
    public void meow() {
        System.out.println("Meo meo!");
    }
}

**Polymorphism (Tính Đa Hình) 🎭**
Để các đối tượng khác nhau có thể thực hiện cùng một hành động theo cách riêng của chúng, bạn cần:

Một phương thức chung ở lớp cha.

Các lớp con định nghĩa lại (ghi đè) phương thức đó.
Ví dụ (khi chưa có đa hình):
public class Animal {
    public void makeSound() {
        System.out.println("An animal makes a sound.");
    }
}
public class Dog extends Animal {}
public class Cat extends Animal {}

public class MyClass {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // In ra: "An animal makes a sound." -> Không đúng!
    }
}
# 1.Sử dụng @Override Tại lớp con, viết lại phương thức makeSound() để nó có hành vi riêng
public class Dog extends Animal {
    @Override // Báo cho Java biết đây là hành vi ghi đè
    public void makeSound() {
        System.out.println("Gau gau!");
    }
}
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meo meo!");
    }
}
# 2. Gọi phương thức Giờ đây, khi bạn gọi makeSound(), Java sẽ tự động biết phải chạy phiên bản của Dog hay Cat.
// main()
Dog myDog = new Dog();
myDog.makeSound(); // In ra: "Gau gau!"

Cat myCat = new Cat();
myCat.makeSound(); // In ra: "Meo meo!"

**Abstraction (Tính Trừu Tượng) 👻**
Để ép buộc các lớp con phải tuân theo một "bộ khung" chung, bạn cần:

Tạo ra một "bản thiết kế" hoặc một "hợp đồng" mà không cần quan tâm chi tiết bên trong.

Bắt các lớp con phải tự định nghĩa chi tiết cho "bản thiết kế" đó.

Ví dụ (khi chưa có trừu tượng): Bạn muốn mọi "Hình học" đều phải có cách tính diện tích, nhưng bạn lại quên viết hàm đó cho lớp Triangle.
public class Circle {
    public double getArea() { /* code tính diện tích hình tròn */ }
}
public class Triangle {
    // Lập trình viên quên không viết hàm getArea()!
    // Chương trình sẽ báo lỗi ở một nơi nào đó rất xa.
}
# 1.Sử dụng abstract class và abstract method Tạo một lớp cha trừu tượng Shape và một phương thức trừu tượng getArea(). Phương thức này không có code, nó chỉ là một quy tắc.
public abstract class Shape {
    // Bất kỳ ai kế thừa Shape ĐỀU PHẢI có hàm này
    public abstract double getArea();
}
# 2.Lớp con bắt buộc phải @Override Bây giờ, nếu lớp Circle hay Triangle kế thừa từ Shape mà không viết code cho phương thức getArea(), Java sẽ báo lỗi ngay lập tức, không cho chạy chương trình.
public class Circle extends Shape {
    // BẮT BUỘC phải có hàm này, nếu không sẽ báo lỗi
    @Override
    public double getArea() {
        // code tính diện tích hình tròn
        return ...;
    }
}
public class Triangle extends Shape {
    // BẮT BUỘC phải có hàm này
    @Override
    public double getArea() {
        // code tính diện tích hình tam giác
        return ...;
    }
}


**CÂU HỎI**
## Câu hỏi về OOP (Quan trọng nhất) ⭐️
Đây là phần "ăn điểm" chính. Nhà tuyển dụng muốn xem tư duy thiết kế của bạn.

Trình bày 4 tính chất của OOP.

Hãy nêu tên (tiếng Việt + Anh) và giải thích ngắn gọn ý nghĩa của: Đóng gói (Encapsulation), Kế thừa (Inheritance), Đa hình (Polymorphism), và Trừu tượng (Abstraction).

Phân biệt Overloading (Nạp chồng) và Overriding (Ghi đè).

Đây là câu hỏi chắc chắn sẽ hỏi. Phải nắm vững: cùng tên/khác tham số, cùng lớp/khác lớp, compile-time/run-time.

Phân biệt abstract class và interface. Khi nào thì dùng cái nào?

Đây là câu hỏi khó và quan trọng nhất cho Junior.

Abstract class: Dùng khi muốn chia sẻ code (có cả phương thức đã viết code và phương thức trừu tượng). Một lớp chỉ extends 1 abstract class.

Interface: Dùng để định nghĩa một "hợp đồng" hay "bộ quy tắc". Một lớp có thể implements nhiều interface.

Java có hỗ trợ đa kế thừa không?

Không (với class). Nhưng có thể đạt được đa kế thừa (về mặt hành vi) thông qua interface.