package com.example.demo.conditional;

import java.util.Map;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConditionalTest {
	AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);

	// 基于java的配置文件
	@Test
	// 无需main方法直接测试分支方法，需Junit依赖
	public void test() {
		Map<String, Person> map = ac.getBeansOfType(Person.class);
		// 获取类型为Person类的bean
		System.out.println(map);
		// 输出map集合的元素
	}
}
