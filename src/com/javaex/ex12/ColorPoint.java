package com.javaex.ex12;

public class ColorPoint extends Point {
	
	
	//필드
	private String color;
	
	//생성자
	public ColorPoint() {
		super();
	}
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}
	
	//메소드 gs
	public void setColor(String color) {
		this.color = color;
	}
	
	//메소드 일반
	
	//메소드 toString
	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	//메소드 showInfo
	public void showInfo() {
		System.out.println("(x= "+ super.getX() + ", y= " + super.getY() + " color= " + color + " )");
	}
	
	

}
