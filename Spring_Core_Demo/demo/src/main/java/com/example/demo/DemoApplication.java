package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
    public class DemoApplication implements CommandLineRunner {
        private Store store;

        public DemoApplication(Store store){
            this.store = store;
        }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }

    @Override
    public void run(String[] args) throws Exception{
        System.out.println("Spring boot đã khởi động xong");
        store.purchaseItem("LapTop");
    }
}
