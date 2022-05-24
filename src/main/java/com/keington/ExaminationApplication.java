package com.keington;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Xu.Huaian
 * @date 2022/05/24
 */

@SpringBootApplication(scanBasePackages = "com.keington")
@MapperScan("com.keington.mapper")
public class ExaminationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExaminationApplication.class, args);
    }
}
