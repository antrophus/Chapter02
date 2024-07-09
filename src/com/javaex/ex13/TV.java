package com.javaex.ex13;

public class TV {

	// 필드
	private int channer;
	private int volume;
	private boolean power;

	// 생성자
	public TV() {
		super();
	}

	public TV(int channer, int volume, boolean power) {
		super();
		this.channer = 7;
		this.volume = 20;
		this.power = false;
	}
	// 메소드 gs

	public int getChanner() {
		return channer;
	}

	public int getVolume() {
		return volume;
	}

	public boolean getPower() {
		return power;
	}

	// 메소드 일반
	public void channer(int channer) {
		if (channer > 0 && channer <= 255) {
			this.channer = channer;

		} else {
			this.channer = 1;
		}
	}

	public void volume(int volume) {
		if (volume >= 0 && volume <= 100) {
			this.volume = volume;

		} else {
			this.volume = 100;
		}
	}
	public void power(boolean power) {
		if (power==true) {
			this.power = true;
			System.out.println("TV켜짐");
		}else {
			this.power = false;
			System.out.println("TV꺼짐");
		}
	}

	@Override
	public String toString() {
		return "TV [channer=" + channer + ", volume=" + volume + ", power=" + power + "]";
	}
	
	public void status() {
		System.out.println("channer = " + channer + ", volume=" + volume + ", power=" + power);
	}

	public void volume(boolean up) {
		if (up == true) {
			this.volume = volume + 1;
		}else if (up == false) {
			this.volume = volume - 1;
		}
		
	}

	public void channer(boolean up) {
		if (up == true) {
			this.channer = channer + 1;
		}else if (up == false) {
			this.channer = channer - 1;
		}
	}

	
	
}

// 메소드 toString

// 메소드 showInfo
