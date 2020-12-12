package com.example.demo.app;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.demo.enable_auto.Test;

public class DamoConfiguration {
	@Configuration
	@EnableAutoConfiguration
	@ComponentScan
	public class DemoConfiguration {
		@Bean
		public Test test() {
			return new Test();
		}
	}
}
