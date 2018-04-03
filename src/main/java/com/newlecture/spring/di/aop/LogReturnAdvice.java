package com.newlecture.spring.di.aop;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/*주업무의 리턴된 결과값을 이용해 보조업무를 수행할 수 있도록 하는 로직*/
public class LogReturnAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("returnValue : " + returnValue);
	}

}
