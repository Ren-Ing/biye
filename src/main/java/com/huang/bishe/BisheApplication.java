package com.huang.bishe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//exclude = {DataSourceAutoConfiguration.class}
@SpringBootApplication()
//@EntityScan("com.huang.bishe.entity")
//@EnableJpaRepositories("com.huang.bishe.jpa")
//@ComponentScan("com.huang.bishe.serviceImpl")
public class BisheApplication {
    public static void main(String[] args) {
        SpringApplication.run(BisheApplication.class, args);
    }

}
