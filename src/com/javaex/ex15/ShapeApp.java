package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//사각형
		Rectangle r01 = new Rectangle(3,5,"빨강","노랑");
		
		System.out.println(r01.toString());
		
		r01.draw();
		
		//원
		Circle c01 = new Circle(5, "핑크", "블랙");
		
		System.out.println(c01.toString());
		
		c01.draw();
		
		//삼각형
		Triangle t01 = new Triangle(3, 10, "블랙", "핑크");
		System.out.println(t01.toString());
		
		t01.draw();
		
		

	}

}
