package com.javaex.test;

public class Point2App {

	public static void main(String[] args) {
		
		Point2 p01 = new Point2();
		Point2 p02 = new Point2();
		
		p01.setX(2);
		p01.setY(3);
		
		p02.setX(100);
		p02.setY(200);
		
		p01.draw();
		p02.draw();
		
		System.out.println("------------------------------");

		/* 생성자에 같은 자료형의 순서를 다르게 별도 생성해도 구분하지 못한다.
		Point2 p03 = new Point2(100); // x값만 세팅 -
		Point2 p04 = new Point2(500); // y값만 세팅
		*/

	}

}
