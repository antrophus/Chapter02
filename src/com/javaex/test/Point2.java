package com.javaex.test;

public class Point2 {
	
	//필드
	private int x;
	private int y;
	
	
	
	//생성자
	
	
	//메소드
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
	
	//메소드 일반
	public void draw() {
		 System.out.println("점[x="+ x + ", y=" + y +"]을 그렸습니다." );
	}

}
