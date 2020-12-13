package com.example.demo.enable_auto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@AutoConfigureBefore(Test.class)
class DemoConfiguration{
	@Bean
	public Test test() {
		return new Test();
	}
}
public class DemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(DemoConfiguration.class, args);
		SpringApplication bootstrap= new SpringApplication(DemoConfiguration.class);
		bootstrap.run(args);
	}

}