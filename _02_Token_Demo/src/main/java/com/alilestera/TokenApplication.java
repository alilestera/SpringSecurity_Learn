package com.alilestera;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Alilestera
 * @date 2/20/2022
 */
@SpringBootApplication
@MapperScan("com.alilestera.mapper")
public class TokenApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(TokenApplication.class, args);
    }
}
