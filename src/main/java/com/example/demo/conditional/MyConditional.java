package com.example.demo.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/*
 ** 实现condition 接口 ， 重写matches()方法
 **/
public class MyConditional implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		System.out.println("hello condition");
		return false;//返回false表示不加载此配置类或bean ， true 反之
	}
	

}
