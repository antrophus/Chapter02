package com.javaex.ex03;

//클래스명
public class Goods {
	
	//필드 --> 대부분의 경우 필드를 보호한다.(캡슐화)
	private String name;
	private int price;
	
	//생성자
	
	
	
	//메소드
	//이름 저장
	public void setName(String n) {
		name = n;
	}
	//이름 읽기
	public String getName() {
		return name;
	}
	
	//가격 저장
	public void setPrice(int p) {
		price = p;
	}
	
	//가격 읽기
	public int getPrice() {
		return price;
	}
	
	//정보출력
	public void showInfo() {
		System.out.println("상품이름: " + name);
		System.out.println("가격 : " + price);
		System.out.println("--------------");
	}
		
}
