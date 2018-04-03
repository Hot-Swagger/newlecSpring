package com.newlecture.spring.di.aop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/*주업무가 처리되기 이전에 보조업무를 수행할 수 있도록 하는 로직*/
public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Log Before");
		
	}

}
