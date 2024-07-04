package com.javaex.ex10;

public class MathApp {
	// static 조사한다.
	
	public static void main(String[] args) {
		
		
		Math.plus(5, 10);
		System.out.println(Math.plus(5, 10));
		System.out.println(Math.plus(1.5, 20));
		System.out.println(Math.plus(3, 10));
		System.out.println(Math.plus(2.3, 11.2));
		System.out.println("-----------------------");
		int sum = Math.plus(5, 1000);
		System.out.println(sum);
		
		double result = Math.circle(5);
		System.out.println(result);
		
	}
	

}
