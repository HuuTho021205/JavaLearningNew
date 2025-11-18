package com.example.demo;

import org.springframework.stereotype.Component;

    @Component // Bùa chú 2: Báo cho Spring "Hãy tạo 1 bean của lớp này"
    public class Store {

        // 1. Khai báo sự PHỤ THUỘC (Dependency)
        // Lớp Store cần NotificationService để hoạt động.
        private final NotificationService notificationService;

        // 2. Tiêm Phụ thuộc (Dependency Injection) qua Constructor
        // Đây là phần quan trọng nhất:
        // Lớp Store "yêu cầu" Spring: "Khi ông tạo ra tôi,
        // hãy tìm và TIÊM (inject) cho tôi một bean NotificationService"
        public Store(NotificationService notificationService) {
            this.notificationService = notificationService;
        }

        // 3. Sử dụng sự phụ thuộc
        public void purchaseItem(String item) {
            System.out.println("Đang xử lý mua hàng: " + item);

            // Gọi dịch vụ đã được tiêm
            notificationService.sendNotification("Đã mua " + item + " thành công!");
        }
}
