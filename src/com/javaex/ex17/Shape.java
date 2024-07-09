package com.javaex.ex17;

public abstract class Shape {
	// 필드
	protected String fillColor;
	protected String lineColor;

	// 생성자

	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	// 메소드 gs
	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	// 메소드 일반 - toString
	@Override
	public String toString() {
		return "Shape [fillColor=" + fillColor + ", lineColor=" + lineColor + "]";
	}

	// 오버라이딩 전용:abstract 예약어사용, 내용을 표현하는 곳이 없다. 추상클래스
	//	public abstract void draw(); -> interface 담당

	// abstract 메소드를 가지고 있는 클래스는 메모리에 올릴 수 없다.
	// 따라서 클래스에도 abstract 예약어 사용
	// 상속전용 : 자식클래스는 abstract 선언된 메소드를 반드시 사용해야 한다.

	public abstract double area();

}
