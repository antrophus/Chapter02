package com.javaex.ex18;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		try {
			double result = 100/num;
			System.out.println(result);
			
		}catch(ArithmeticException e) {
			System.out.println(e.toString());
			System.out.println("catch : 0으로 나눌 수 없습니다.");
			
		}finally {
			System.out.println("finally : 공통인영역");
			
		}
		
		System.out.println("프로그램종료");
		
		sc.close();
		
				
	}

}
