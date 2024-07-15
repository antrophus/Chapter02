package com.javaex.Ex19;

public class MyFileApp {

	public static void main(String[] args) {
		
		MyFile mf = new MyFile();
		String str = mf.read("c:/school.txt");
		
		System.out.println(str);
	}

}
