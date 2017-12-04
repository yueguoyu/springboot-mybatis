package com.ygy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author ygy
 * @date 2017/11/27
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@MapperScan("com.ygy.mapper")
public class YgyApplication {

	public static void main(String[] args) {
		SpringApplication.run(YgyApplication.class, args);
	}
}
