package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
 * "三体"结构并不是指只包含三个Annotation 是指包含的重要的注解只有三个Annotation
 * 
 * @Configuration
 * @EnableAutoConfiguration
 * @ConponentScan
 * */
@SpringBootApplication // springBoot的复合Annotation（springBoot的"三体"结构）
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
