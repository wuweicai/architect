package com.ysx.architect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@EnableCaching
public class ArchitectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchitectApplication.class, args);
    }

}
