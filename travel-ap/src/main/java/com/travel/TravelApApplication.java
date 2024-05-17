package com.travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ServletComponentScan
@MapperScan(basePackages = {"com.travel.mapper"})
public class TravelApApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelApApplication.class);
    }
}
