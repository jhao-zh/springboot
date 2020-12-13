package com.example.demo.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/*
 ** @conditional为筛选Annotation  
 ** 筛选条件写在MyConditional类的matches()方法内
 ** 筛选类需要继承 condition 接口
 ** 
 ** 其他派生Annotation
 ** @ConditionalOnBean：当容器里有指定的 Bean 的条件下。
 ** @ConditionalOnClass：当类路径下有指定的类的条件下。
 ** @ConditionalOnExpression：基于 SpEL 表达式作为判断条件。
 ** @ConditionalOnJava：基于 JVM 版本作为判断条件。
 ** @ConditionalOnJndi：在 JNDI 存在的条件下查找指定的位置。
 ** @ConditionalOnMissingBean：当容器里没有指定 Bean 的情况下。
 ** @ConditionalOnMissingClass：当类路径下没有指定的类的条件下。
 ** @ConditionalOnNotWebApplication：当前项目不是 Web 项目的条件下。
 ** @ConditionalOnProperty：指定的属性是否有指定的值。
 ** @ConditionalOnResource：类路径是否有指定的值。
 ** @ConditionalOnSingleCandidate：当指定 Bean 在容器中只有一个，或者虽然有多个但是指定首选的 Bean。
 ** @ConditionalOnWebApplication：当前项目是 Web 项目的条件下。
 * */

//创建配置类
@Configuration
public class MyConfiguration {
	// 创建一个name为zjh的bean
	@Bean(name = "zjh")
	public Person person1() {
		return new Person("zjh", 20);
	}

	// 创建一个name为lish的bean，并加入删选条件
	@Conditional(MyConditional.class)
	@Bean("lish")
	public Person person2() {
		return new Person("lish", 20);
	}
}
