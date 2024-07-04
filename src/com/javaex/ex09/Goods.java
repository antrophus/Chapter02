package com.javaex.ex09;

public class Goods {
	
	//필드
	private String name;
	private int price;
	public static int count;
	
	//생성자
	public Goods() {
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		
		count++;
	}
	
	//메소드 gs
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", count=" + count + "]";
	}
	
	

	
}
