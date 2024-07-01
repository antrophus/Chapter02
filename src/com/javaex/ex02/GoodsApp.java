package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		//컴퓨터
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.Price = 1000000;
		//컵
		Goods cup = new Goods();
		cup.name = "머그컵";
		cup.Price = 2000;
		//카메라
		Goods camera = new Goods();
		camera.name = "Nikkon";
		camera.Price = 400000;
		
		//컴퓨터 가격
		System.out.println(computer.Price);
		
		//컵이름
		System.out.println(cup.name);
		
		//컴퓨터 이름
		System.out.println(computer.name);
		
		//컵 가격
		System.out.println(cup.Price);
		
		//카메라 이름
		System.out.println(camera.name);
		
		//카메라 가격
		System.out.println(camera.Price);

	}

}
