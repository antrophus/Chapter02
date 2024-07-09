package com.javaex.ex17;

public abstract class ShapeApp extends Shape implements Drawable	{

	public static void main(String[] args) {
		
	Drawable r01 = new Ractangle(50, 10, "블랙", "핑크");
	Drawable p01 = new Point(6, 5);
	Drawable c01 = new Circle(5, "블랙", "핑크");
	Drawable t01 = new Triangle(1, 9, "블랙", "핑크");
	
	Drawable[] dArray = new Drawable[4];
	
	dArray[0] = r01;
	dArray[1] = p01;
	dArray[2] = c01;
	dArray[3] = t01;
	
	for(int i = 0; i<dArray.length; i++) {
		dArray[i].draw();
		
		
	}
	
	
		

	}

}
