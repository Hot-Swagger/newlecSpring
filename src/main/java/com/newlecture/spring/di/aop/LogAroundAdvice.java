package com.newlecture.spring.di.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.StopWatch;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invoc) throws Throwable {
		// TODO Auto-generated method stub
		
		StopWatch sw = new StopWatch();
		sw.start();
		System.out.println("Around Before : ");
		
		Object result = invoc.proceed();
		
		sw.stop();
		System.out.println("Around After : " + sw.getTotalTimeMillis());
		
		return result;
	}


}
