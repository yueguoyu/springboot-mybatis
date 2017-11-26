package com.ygy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ygy.mapper")
public class YgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YgyApplication.class, args);
	}
}
