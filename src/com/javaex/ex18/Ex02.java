package com.javaex.ex18;

public class Ex02 {

	public static void main(String[] args) {

		int[] intArray = new int[3];

		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;

		try {
			for (int i = 0; i <= intArray.length; i++) {
				System.out.println(intArray[i]);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("배열의 범위를 벗어나 강제 종료합니다.");

		} // finally { --> 생략가능

		// }
		System.out.println("프로그램 종료");
	}
}
