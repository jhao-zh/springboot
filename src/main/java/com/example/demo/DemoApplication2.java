package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
//@ComponentScan
/*
 ** 如果只使用该启动类以上三个Annotation也可完成， 但是写三个Annotation显然不如写一个更方便所以
 ** 写一个@SpringBootApplication这样的一站复合式Annotation更好
 ** 
 * @Configuration "创世纪" 全新的配置方法，标注了 @Configuration 之后，启动类本身其实也是一个 IoC 容器的配置类
 ** 
 * @EnableAutoConfiguration "炒冷饭" 借助 @Import 的帮助，将所有符合自动配置条件的 bean 定义加载到 IoC 容器
 ** 
 * @ComponentScan "可有可无" @ComponentScan 的功能其实就是自动扫描并加载符合条件的组件或 bean 定义，最终将这些
 * bean 定义加载到容器中，加载 bean 定义到 Spring 的 IoC 容器，我们可以手工单个注册，不一定非要通过批量的自动扫描完成
 */
public class DemoApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication2.class, args);
	}

}
