package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**为了便于理解可以将该启动类拆分为以下两个类
 * 
 **该类为典型的javaConfig的配置写法的IoC容器配置类
 * @Configuration
 * @EnableAutoConfiguration
 * @ComponentScan 
 * public class DemoConfiguration {
 * 	@Bean 
 * 	public Controller controller() { 
 * 		return new Controller(); 
 * 	} 
 * }
 * 
 **该类只是一个标准的Standalone类型的java程序main函数启动类
 * public class DemoApplication3 { 
 * 	public static void main(String[] args){ 
 * 		SpringApplication.run(DemoConfiguration.class, args); 
 *  } 
 * }
 * 
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class DemoApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication3.class, args);
	}

}
