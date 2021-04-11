package com.huang.bishe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@EntityScan("com.huang.bishe.entity")
@EnableJpaRepositories("com.huang.bishe.jpa")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BisheApplication {
    public static void main(String[] args) {
        SpringApplication.run(BisheApplication.class, args);
    }

}
