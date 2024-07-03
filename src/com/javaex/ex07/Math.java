package com.javaex.ex07;

public class Math {
	
	//필드
	
	//생성자
	
	//메소드 - 게터, 세터
	
	//일반 메소드
	 //* 메소드 오버로딩
	public int plus(int a, int b) {
		int sum =  a + b;
		return sum;
	}
	public double plus(double a, int b) {
		double sum = a + b;
		return sum;
	}
	public double plus(int a, double b) {
		double sum = a + b;
		return sum;
	}
	public double plus(double a, double b) {
		double sum = a + b;
		return sum;
	}

}
