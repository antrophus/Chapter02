package com.javaex.ex17;

public class Circle extends Shape implements Drawable {
	// 필드
	private int radius;

	// 생성자
	public Circle() {
		super();
	}

	public Circle(int radius, String fillColor, String lineColor) {
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.radius = radius;
	}

	// 메소드 gs
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	// 메소드 일반 - toString
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	// 메소드 일반 - draw
	public void draw() {
		System.out.println("======== 원을 그렸습니다 =========");
		System.out.println("반지름: " + radius);
		System.out.println("면색: " + fillColor);
		System.out.println("선색: " + lineColor);
		System.out.println("===============================");
	}

	// 면적구하기
	public double area() {
		return 3.14 * radius * radius;

	}

}
