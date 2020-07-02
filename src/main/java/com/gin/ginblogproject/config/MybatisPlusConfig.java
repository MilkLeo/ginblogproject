package com.gin.ginblogproject.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *@description 分页插件配置
 *@author suewong
 *@date 2020/6/29 15:12
*/
@Configuration
@MapperScan("com.gin.ginblogproject.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}

