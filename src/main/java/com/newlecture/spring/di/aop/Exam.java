package com.newlecture.spring.di.aop;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

/*@Component("exam2")*/
@Repository
public class Exam {
	private int kor;
	private int eng;
	private int math;

	public int total() {
		return kor + eng + math;
	}

	public float avg() {

		//return total() / 3.0f;
		return total() / 0;
	}

	public Exam() {

	}

	public Exam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}