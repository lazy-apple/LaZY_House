package com.lazy.house.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication(scanBasePackages = "com.lazy.house")
@MapperScan("com.lazy.house.biz.mapper")
@EnableAsync
public class LazyHouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LazyHouseApplication.class, args);
    }

}
