package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//사각형
		Rectangle r01 = new Rectangle(3,5,"빨강","노랑");
		
//		System.out.println(r01.toString());
		
//		r01.draw();
		
		//원
		Circle c01 = new Circle(5, "핑크", "블랙");
		
//		System.out.println(c01.toString());
//		
//		c01.draw();
		
		//삼각형
		Triangle t01 = new Triangle(3, 10, "블랙", "핑크");
//		System.out.println(t01.toString());
//		
//		t01.draw();
		
		
		//섞어쓰기 
		//사각형 --> 도형
		Shape s01 = new Rectangle(3,5,"빨강","노랑");
		
		//원 --> 도형
		Shape s02 = new Circle(5, "핑크", "블랙");
		
		//삼각형 --> 도형
		Shape s03 = new Triangle(3, 10, "블랙", "핑크");
		
		//배열
		
		Shape[] sArray = new Shape[3];
		
		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;
		
		// 배열 출력 override 부모클래스 메소드를 동일한 이름으로 재작성하면 부모클래스 메소드 무시하고 덮어씀
		for(int i = 0; i<sArray.length; i++) {
			sArray[i].toString();
			sArray[i].draw();
		}
		//다운캐스팅
		System.out.println(((Circle)s02).getRadius());
		
		
		
		
		

	}

}
