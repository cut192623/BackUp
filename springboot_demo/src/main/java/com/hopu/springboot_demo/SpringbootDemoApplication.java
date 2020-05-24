package com.hopu.springboot_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 配置当前应用程序是SpringBoot项目
 * 该类必须放在项目包在根目录
 */
@SpringBootApplication
//映射接口的扫描
@MapperScan("com.hopu.springboot_demo.dao")
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        //启动应用程序
        SpringApplication.run(SpringbootDemoApplication.class, args);
    }
}
