package com.javaex.ex16;

public class Rectangle extends Shape {
	// 필드
	private int width;
	private int height;

	// 생성자
	public Rectangle() { // default 생성자
		// super();
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		/*
		 * super(); super.setFillColor(fillColor); super.setLineColor(lineColor);
		 * this.width = width; this.height = height;
		 */
		/*
		 * super(fillColor, lineColor); this.width = width; this.height = height;
		 */

		// 부모의 필드가 protected
		super();
		super.fillColor = fillColor;
		super.lineColor = lineColor;
		this.width = width;
		this.height = height;
	}

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
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}

	// 메소드 일반 - draw
	public void draw() {
		System.out.println("======== 사각형을 그렸습니다 =========");
		System.out.println("가로:" + width + ", 세로:" + height + ", 면색: " + fillColor + ", 선색: " + lineColor);
		System.out.println("=================================");
	}

	// 면적구하기
	public double area() {
		return width*height;

	}

}
