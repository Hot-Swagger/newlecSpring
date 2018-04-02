package com.newlecture.spring.di.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
/*<context:component-scan base-package="com.newlecture.spring.di"/> 의기능*/
@ComponentScan("com.newlecture.spring.di")
public class NewlecAppConfig {

	/*<bean name="console" class="com.newlecture.spring.di.FlowExamConsole"/> 와 동일한 기능*/
	@Bean
	public ExamConsole console() {
		return new FlowExamConsole();
	}
}
