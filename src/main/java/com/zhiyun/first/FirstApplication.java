package com.zhiyun.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {
        System.out.println("启动开始！！！");
        SpringApplication.run(FirstApplication.class, args);
        System.out.println("启动完成！！！");
    }

}
