package com.javaex.ex04;


//클래스
public class Point {
	
	//필드
	private int x;
	private int y;
	
	//생성자
	
	//메소드
	 //이름저장 >> X 값 넣기
	 public void setX(int x) {
	 	this.x = x;
	 }
	
	 //읽기 >> X값 읽기
	 public int getX() {
		 return x;
	 }
	 
	 //이름저장 >> Y 값 넣기
	 public void setY(int y) {
		 this.y = y;
	 }
	 
	 //읽기 >> Y값 읽기
	 public int getY() {
		 return y;
	 }

	//출력
	 public void draw() {
		 System.out.println("점[x="+ x + ", y=" + y +"]을 그렸습니다." );
		 
	 }

}
