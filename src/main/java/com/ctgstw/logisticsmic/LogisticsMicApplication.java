package com.ctgstw.logisticsmic;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.ctgstw.logisticsmic.mapper"})
@EnableSwagger2Doc
public class LogisticsMicApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticsMicApplication.class, args);
    }

}

