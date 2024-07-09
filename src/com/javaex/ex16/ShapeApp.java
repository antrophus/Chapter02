package com.javaex.ex16;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형(사각형, 삼각형, 원)을 Shape 으로 관리
		Shape[] sArray = new Shape[3];
		
		//도형 메모리에 올리기
		Shape r01 = new Rectangle(2, 4, "빨강", "검정");
		Shape c01 = new Circle(10, "빨강", "검정");
		Shape t01 = new Triangle(30, 30, "빨강", "검정");
		
		
		sArray[0] = r01;
		sArray[1] = c01;
		sArray[2] = t01;
		
		
		for(int i = 0 ; i<sArray.length; i++) {
			sArray[i].draw(); // 오버라이딩된 메소드
		}
		/////////////////////////////////////////////////////
		
		for (int i = 0; i<sArray.length; i++) {
			
			System.out.println(sArray[i].area());
		}
	}

}
