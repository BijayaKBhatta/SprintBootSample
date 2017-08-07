package com.productdata.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.productdata")
public class ProductDataApplication {
	public static void main(String[] args) {
		SpringApplication.run(ProductDataApplication.class, args);
	}
}
