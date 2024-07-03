package com.javaex.ex05;

public class Song {
	
	//필드
	
	private String artist;
	private String title;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	public Song() {
		
	}
	
	public Song(String artist, String title, String album, String composer, int year, int track) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
	}
	
	
	
	
	// Alt + Shift + s : Generate Getter and Setter 자동 생성
	//메소드 getter - setter
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAlbum(String album) {
		this.album = album;
		
	}
	
	public String getAlbum() {
		return album;
	}
		
	public void setComposer(String composer) {
		this.composer = composer;
		
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setYear(int year) {
		this.year = year;
		
	}
	
	public int getYear() {
		return year;
	}
	
	public void setTrack(int track) {
		this.track = track;
		
	}
	
	public int getTrack() {
		return track;
	}
	
//	public void showInfo() {
//		System.out.println( artist + ", " + title + " ( " + album + ", " + year + ", " + track +"번 track, " + composer + " 작곡" + " )\t" );
//	}

	@Override
	public String toString() {
		return "Song [artist=" + artist + ", title=" + title + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	
}


