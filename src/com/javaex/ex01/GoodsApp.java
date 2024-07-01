package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods computer = new Goods();
		computer.name = "LG그램";
		computer.price = 1000000;
		
		System.out.println(computer.name);
		System.out.println(computer.price);
	}

}
