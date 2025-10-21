package Ngay3_Mang_tt;

import java.util.Scanner;

//Yêu cầu: Cho một mảng số nguyên và một số target. Tìm chỉ số (index) của hai số trong
//mảng sao cho tổng của chúng bằng target. (Giả sử luôn có một cặp kết quả duy nhất).
//
//Ví dụ: [2, 7, 11, 15] và target = 9 -> Trả về [0, 1] (vì a[0] + a[1] = 2 + 7 = 9).
public class Bai_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu trong mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap vao cac phan tu cua mang: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao so target: ");
        int b = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    System.out.println("Day la cap index can tim: ");
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}


//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Arrays; // Thêm import để in mảng
//
//public class Bai_2_ToiUu {
//
//    public static int[] findTwoSum(int[] nums, int target) {
//        // Map sẽ lưu trữ: (Giá trị phần tử, Chỉ số của nó)
//        Map<Integer, Integer> map = new HashMap<>();
//
//        // Duyệt qua mảng chỉ một lần
//        for (int i = 0; i < nums.length; i++) {
//            int complement = target - nums[i];
//
//            // 1. Kiểm tra xem số cần tìm (complement) đã có trong map chưa
//            if (map.containsKey(complement)) {
//                // 2. Nếu có, trả về ngay lập tức
//                //    map.get(complement) là chỉ số của số complement
//                //    i là chỉ số của số hiện tại
//                return new int[] { map.get(complement), i };
//            }
//
//            // 3. Nếu không, thêm số hiện tại và chỉ số của nó vào map
//            //    để các số sau có thể tìm thấy nó
//            map.put(nums[i], i);
//        }
//
//        // Trường hợp không tìm thấy (mặc dù đề bài nói luôn có)
//        throw new IllegalArgumentException("Khong tim thay ket qua");
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao so phan tu trong mang: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        System.out.println("Nhap vao cac phan tu cua mang: ");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.println("Nhap vao so target: ");
//        int b = sc.nextInt();
//
//        // Gọi hàm và nhận kết quả
//        int[] result = findTwoSum(a, b);
//
//        System.out.println("Day la cap index can tim: ");
//        // In mảng kết quả cho đẹp
//        System.out.println(Arrays.toString(result));
//    }
//}