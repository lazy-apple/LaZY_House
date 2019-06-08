package com.lazy.house.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lazy.house")
public class LazyHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LazyHouseApplication.class, args);
    }

}
