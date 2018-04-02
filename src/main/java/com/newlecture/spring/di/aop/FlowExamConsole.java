package com.newlecture.spring.di.aop;

import java.util.Date;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;

public class FlowExamConsole implements ExamConsole {

	@Autowired()
	/*@Qualifier("exam2")*/
	private Exam exam;

	public FlowExamConsole() {
		//exam = new Exam();
	}

	public FlowExamConsole(Exam exam) {

		this.exam = exam;

	}

	public void input() {
		
		//System.out.println("start : " + new Date());
		
		Scanner scan = new Scanner(System.in);
		int kor;
		int eng;
		int math;

		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                  Exam Input              │");
		System.out.println("└──────────────────────────────────────────┘");

		System.out.print("kor : ");
		kor = scan.nextInt();
		System.out.print("eng : ");
		eng = scan.nextInt();
		System.out.print("math : ");
		math = scan.nextInt();

		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		//System.out.println("end : " + new Date());
	}

	public void print() {
		
		//System.out.println("start : " + new Date());
		
		int kor = exam.getKor();
		int eng = exam.getEng();
		int math = exam.getMath();
		int total = exam.total();
		float avg = exam.avg();

		System.out.println("┌──────────────────────────────────────────┐");
		System.out.println("│                Exam Print                │");
		System.out.println("└──────────────────────────────────────────┘");

		System.out.printf("kor : %3d\n", kor);
		System.out.printf("eng : %3d\n", eng);
		System.out.printf("math : %3d\n", math);
		System.out.printf("total : %3d\n", total);
		System.out.printf("avg : %+6.2f\n", avg);
		
		//System.out.println("end : " + new Date());
	}

	public void setExam(Exam exam) {
		//System.out.println("start : " + new Date());
		this.exam = exam;
		//System.out.println("end : " + new Date());
	}
}
