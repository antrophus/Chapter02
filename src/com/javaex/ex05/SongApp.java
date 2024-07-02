package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song Iu = new Song();
		Song Big = new Song();
		Song Bus = new Song();
		
		Iu.setAlbum("Real");
		Iu.setArtist("아이유");
		Iu.setComposer("이민수");
		Iu.setTitle("좋은날");
		Iu.setTrack(3);
		Iu.setYear(2010);
		
		Big.setAlbum("Always");
		Big.setArtist("BIGBANG");
		Big.setComposer("G-DRAGON");
		Big.setTitle("거짓말");
		Big.setTrack(2);
		Big.setYear(2007);
		
		Bus.setAlbum("버스커버스커1집");
		Bus.setArtist("버스커버스커");
		Bus.setComposer("장범준");
		Bus.setTitle("벚꽃엔딩");
		Bus.setTrack(4);
		Bus.setYear(2012);
		
		Iu.showInfo();
		Big.showInfo();
		Bus.showInfo();

	}

}
