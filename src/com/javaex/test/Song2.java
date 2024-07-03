package com.javaex.test;

public class Song2 {
	
	//필드
	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	//생성자 - 자동 생성 단축키 : [Alt + Shift + S] --> Generate Constructor using Fields...
	public Song2() { 
		//Default 생성자
		//메모리에 올리기
	} 
	
	
	public Song2(String artist, String title, String album, String composer, int year) { 
		//필드 5개
		//메모리 올리기
		this.artist = artist;
		this.title = title;
		this.album = album; //로직
		
		this.composer = composer; //로직
		
		if(year >= 2000) { //로직
			this.year = year; 
		} else {
			this.year = 0;
		}
		
	}
	
	public Song2(String artist, String title, String album, String composer, int year, int track) { 
		//필드 6개
		//메모리 올리기
		this(artist, title, album, composer, year); // 앞 필드 5개 생성자가 한 작업을 그대로 가져오고, 추가로 자기 작업
		this.track = track;
	}
	
	//메소드 Getter-Setter - 자동 생성 단축키 :  [Alt + Shift + S] --> Generate Getters and Setters...
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	@Override
	public String toString() {
		return "Song2 [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer
				+ ", year=" + year + ", track=" + track + "]";
	}
	
	

	
	
}
