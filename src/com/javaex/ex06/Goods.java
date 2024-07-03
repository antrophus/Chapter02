package com.javaex.ex06;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자  (생략해도 컴퓨터가 알아서 생성 : 클래스에 생성자가 한 개도 정의되어 있지 않으면 컴파일러가 기본생성자를 추가한다.)
	public Goods() {
		// * 메모리에 올리기
		//기본 생성자는 코딩 안해도 생긴다(다른 생성자가 없을때)
		//다른 생성자를 코딩하면 기본생성자는 자동으로 만들어지지 않는다. 생성자가 한 개라도 있으면 기본 생성자를 추가하지 않는다.
		//다른 생성자가 있을 때 기본생성자를 같이 쓰고 싶으면,
		// --->기본생성자를 코딩해줘야한다.
		
	}
	
	public Goods(String name, int price) {
		// * 메모리에 올리기
		this.name = name;
		this.price = price;
	}
	
	//메소드 getter - setter
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
	
	//메소드 - 일반 
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	//그리기
	
	

}
