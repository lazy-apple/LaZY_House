package com.lazy.house.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.lazy.house")
@MapperScan("com.lazy.house.biz.mapper")
public class LazyHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LazyHouseApplication.class, args);
    }

}
