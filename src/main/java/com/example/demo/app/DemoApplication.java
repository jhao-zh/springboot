package com.example.demo.app;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

import com.example.demo.auto_config.Test;

@SpringBootApplication
class DemoConfiguration2 {
	@Bean
	public Test test() {
		return new Test();
	}
}

public class DemoApplication {

	public static void main(String[] args) {
		// SpringApplication.run(DemoApplication.class, args);
		SpringApplication bootstrap = new SpringApplication(DemoConfiguration2.class);// 使用内部类
		// SpringApplication bootstrap = new SpringApplication(DemoConfiguration.class);
		// 使用外部类
		bootstrap.setBanner(new Banner() {

			// 重写打印方法
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				// TODO Auto-generated method stub
				System.out.println("你好 世界");
				// 有banner.txt文件或默认使用banner.txt文件内容
			}
		});

//		bootstrap.setBannerMode(Banner.Mode.CONSOLE);
		// Banner.Mode是一个枚举类
		// Banner.Mode.CONSOLE是控制台输出Banner.Mode.LOG是日志输出，Banner.Mode.OFF是关闭启动banner

//		bootstrap.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));

		bootstrap.run(args);
	}

}
