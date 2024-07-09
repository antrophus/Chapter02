package com.javaex.ex13;

public class TVApp {
	
	public static void main(String[] args) {
		
		TV tv = new TV(7, 20, false);
		
//		tv.status();
		
		tv.power(true);
		tv.volume(120);
		tv.status();
		
		tv.volume(false);
		tv.status();
		
		tv.channer(0);
		tv.status();
		
		tv.channer(true);
		tv.channer(true);
		tv.channer(true);
		tv.status();
		
		tv.power(false);
		tv.status();
		
		
		
		
		
		
		
	}

}
