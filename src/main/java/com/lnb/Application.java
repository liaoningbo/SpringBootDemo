package com.lnb;

import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lnb.mapper")
@Log4j2
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
