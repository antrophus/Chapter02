package com.javaex.ex12;

public class Point {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		super();
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드 gs
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반

	// 메소드 toString
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// 메소드 showInfo
		
	public void showInfo() {
		System.out.println("(x=" + x + ", y=" + y + ")");
		
	}

}
