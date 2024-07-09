package com.javaex.ex16;

public class Triangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Triangle() {
		super();
	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

	// 메소드 gs
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반 - toString
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	// 메소드 일반 draw

	public void draw() {
		System.out.println("======== 삼각형을 그렸습니다. ==========");
		System.out.println("바닥: " + width + ", 높이: " + height + ", 면색: " + fillColor + ", 선색: " + lineColor);
		System.out.println("===================================");
	}

	// 면적구하기
	public double area() {
		return width * height / 2;

	}

}
