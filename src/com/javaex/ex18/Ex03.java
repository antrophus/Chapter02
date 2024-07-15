package com.javaex.ex18;

public class Ex03 {

	public static void main(String[] args) {
		
		Point p01 = new Point(2,5);
		p01.draw();
		
		
		try {
			Point p02 = null;
			p02.draw();
			
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println("주소값이 비어있어요");
			
		}
		System.out.println("프로그램종료");
		
	}

}
