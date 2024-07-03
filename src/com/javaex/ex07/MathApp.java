package com.javaex.ex07;

public class MathApp {

	public static void main(String[] args) {
		
		Math sum = new Math();
		
		System.out.println(sum.plus(13, 2));
		System.out.println(sum.plus(1.3, 2));
		System.out.println(sum.plus(13, 2.5));
		System.out.println(sum.plus(13.6, 2.99));
		
	}

}
