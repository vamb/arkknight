package com.blkstone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.blkstone")
@SpringBootApplication
public class ArknightApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArknightApplication.class, args);
    }

}
