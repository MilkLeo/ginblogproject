package com.gin.ginblogproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan(value = "com.gin.qinblogproject.mapper")
@EnableTransactionManagement(proxyTargetClass = true)
@EnableAsync
@EnableSwagger2
@EnableScheduling
public class GinblogprojectApplication {

    public static void main(String[] args) {
        SpringApplication.run(GinblogprojectApplication.class, args);
    }

}
