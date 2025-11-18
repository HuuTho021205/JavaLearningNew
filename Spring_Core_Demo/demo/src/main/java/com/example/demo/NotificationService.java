package com.example.demo;

import org.springframework.stereotype.Service;
@Service
public class NotificationService {
    public void sendNotification(String message){
        System.out.println("Gửi thông báo" + message);
    }
}
