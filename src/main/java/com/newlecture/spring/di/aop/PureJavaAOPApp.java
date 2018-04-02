package com.newlecture.spring.di.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class PureJavaAOPApp {

	public static void main(String[] args) {
		
		Exam exam = new Exam();
    	FlowExamConsole console = new FlowExamConsole();
    	console.setExam(exam);
    	
    	//Proxy.newProxyInstance(흉내낼 클래스 loader(리플랙션기능), interfaces(인터페이스의목록), 보조업무를 구현한 객체)
    	ExamConsole proxy = (ExamConsole) Proxy.newProxyInstance(FlowExamConsole.class.getClassLoader()
    			, new Class[] {ExamConsole.class}
    			, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						
						System.out.println("start : " + new Date());
						
						Object object = method.invoke(console, args);
						
						System.out.println("end : " + new Date());
						
						return object;
					}
				});
    	
    	proxy.input();
    	proxy.print();

	}

}
