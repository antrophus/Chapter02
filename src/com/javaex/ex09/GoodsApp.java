package com.javaex.ex09;

public class GoodsApp {
	//static 조사
	//필드
	
	//생성자
	
	//메소드 gs
	
	//메소드 일반
	public static void main(String[] args) {
		
		Goods computer = new Goods("LG그램", 1000000);
		System.out.println(computer.toString());
		
		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());
		
		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());
		
		System.out.println(Goods.count);
		
		showEnd();
		
	}
	
	public static void showEnd() {
		System.out.println("---------------------------");
		System.out.println("--     프로그램 종료        --");
		System.out.println("---------------------------");
	}
}
