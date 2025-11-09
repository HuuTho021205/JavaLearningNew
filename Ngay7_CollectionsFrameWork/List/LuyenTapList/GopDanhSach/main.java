package Ngay7_CollectionsFrameWork.List.LuyenTapList.GopDanhSach;
/*Trong main: Tạo 2 List<Integer> (dùng ArrayList).
List<Integer> listA = List.of(1, 5, 8, 12, 15);
List<Integer> listB = List.of(3, 6, 7, 10, 16, 20);
Viết phương thức: static List<Integer> mergeSortedLists(List<Integer> listA, List<Integer> listB)
Logic bên trong:
Tạo một List<Integer> mergedList = new ArrayList<>();.
Tạo 2 biến "con trỏ" (pointer): int i = 0; (cho listA) và int j = 0; (cho listB).
Dùng một vòng lặp while (i < listA.size() && j < listB.size()):
So sánh listA.get(i) và listB.get(j).
Thêm phần tử nhỏ hơn vào mergedList và tăng "con trỏ" ( i++ hoặc j++) của danh sách đó lên.
Sau khi vòng lặp while kết thúc, một trong hai danh sách sẽ vẫn còn phần tử.
Dùng thêm 2 vòng lặp while nữa để thêm tất cả các phần tử còn lại vào mergedList.
In ra mergedList. Kết quả phải là: [1, 3, 5, 6, 7, 8, 10, 12, 15, 16, 20]*/
public class main {

}
