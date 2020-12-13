package com.example.demo.auto_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.app.Test;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@AutoConfigureBefore(Test.class) // 在Democonfiguration之前加载Test.class
//@AutoConfigureAfter(Test.class)//在Democonfiguration之后加载Test.class
class DemoConfiguration {
	@Bean
	public Test test() {
		return new Test();
	}
}

public class DemoApplicationAuto {
	public static void main(String[] args) {
		// SpringApplication.run(DemoConfiguration.class, args);
		SpringApplication bootstrap = new SpringApplication(DemoConfiguration.class);
		bootstrap.run(args);
	}

}
