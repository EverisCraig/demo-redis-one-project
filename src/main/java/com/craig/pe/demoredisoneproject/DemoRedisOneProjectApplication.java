package com.craig.pe.demoredisoneproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DemoRedisOneProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoRedisOneProjectApplication.class, args);
    }

}
