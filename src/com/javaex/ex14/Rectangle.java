package com.javaex.ex14;

public class Rectangle {
	
	//필드
	private int width;
	private int height;
	private String fillColor;
	private String lineColor;
	
	//생성자 2개
	public Rectangle() { //기본 생성자
		super();
	}

	public Rectangle(int width, int height, String fillColor, String lineColor) {
		super();
		this.width = width;
		this.height = height;
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	
	// 메소드 g s
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
	
	//메소드 toString
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", fillColor=" + fillColor + ", lineColor="
				+ lineColor + "]";
	}
	
	public void draw() {
		System.out.println("====사각형을 그렸습니다.======");
		System.out.print("가로: "+width + "\n");
		System.out.print("세로: "+height + "\n");
		System.out.print("면색: "+fillColor + "\n");
		System.out.print("선색: "+lineColor + "\n");
		System.out.println("=========================");
		
	}
	

}
