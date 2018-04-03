package com.newlecture.spring.di.aop;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

/*주업무의 예외가 발생할 경우 그 예외처리를 이용해서 보조업무를 처리하는 로직*/
public class LogThrowsAdvice implements ThrowsAdvice {

	public void afterThrowing(Method method, Object[] args, Object target, Exception e) {
		
		System.out.println("예외 : " + e.getMessage());
	}

}
