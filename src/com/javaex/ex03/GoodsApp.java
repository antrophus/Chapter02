package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
	
		
		/* 캡슐화 - 직접 접근(쓰고, 읽기) 할 수 없다.
		 * -->메소드를 이용한다.
		computer.name ="LG그램";
		computer.price = 1000000;	
		*/
		
		computer.setName("LG그램");
		computer.setPrice(1000000);
		
		Goods cup = new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		
		Goods camera = new Goods();
		camera.setName("Nikkon");
		camera.setPrice(400000);
		
		
		////////////////////////////////////////////////////////
		/*
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		System.out.println(cup.getName());
		System.out.println(cup.getPrice());
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		
		System.out.println("상품이름: " + computer.getName());
		System.out.println("가격 : " + computer.getPrice());
		System.out.println("");
		
		System.out.println("상품이름: " + cup.getName());
		System.out.println("가격 : " + cup.getPrice());
		System.out.println("");
		
		System.out.println("상품이름: " + camera.getName());
		System.out.println("가격 : " + camera.getPrice());
		*/
		
		//정보 출력
		computer.showInfo();
		cup.showInfo();
		camera.showInfo();
		
			
		}
	}


