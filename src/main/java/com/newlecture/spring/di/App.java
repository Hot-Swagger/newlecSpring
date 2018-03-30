package com.newlecture.spring.di;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
		
    public static void main( String[] args ) throws IOException, InstantiationException, IllegalAccessException, ClassNotFoundException
    {
    	//GridExamConsole console = new GridExamConsole();
    	
    	/*String className = "app.properties";
    	
    	Properties properties = new Properties();
    	FileInputStream fis = new FileInputStream(className);
    	properties.load(fis);
    	ExamConsole console = (ExamConsole)Class
    			.forName(properties.getProperty("consdsole"))	// 생성할 개체를 선택하는 부분
    			.newInstance();	// 객체를 생성하는 부분
        console.input();
        console.print();*/
    	
    	/*
    	아래와 같은 부품 생성과 조립을 스프링이 하도록 주문하겠다.
    	Exam exam = new Exam();
    	FlowExamConsole console = new FlowExamConsole();
    	console.setExam(exam);
    	*/
    	
    	ClassPathXmlApplicationContext 콩자루 = new ClassPathXmlApplicationContext("com/newlecture/spring/di/app-context.xml"); 
    	
    	ExamConsole console = (ExamConsole)콩자루.getBean("console");
    	//console.input();
    	console.print();
    }
}
