package com.javaex.ex11;

public class Student extends Person {
	//필드
	private String schoolName;
	
	//생성자
	public Student() {
		super();
	}
	public Student(String schoolName) {
		this.schoolName = schoolName;
		
		
	}
	public Student(String name, int age, String school, String schoolName) {
		/* 방법1 부모의 기본생성자 사용
		super();
		super.setName(name);
		super.setAge(age);
		*/
		
		/* 방법2 부모의 다른생성자(2)사용
		super(name,age); 
		*/
		
		//방법3 부모의 필드의 접근제어자를 protected 놓는다.
		super.name = name;
		super.age = age;
		
		this.schoolName = schoolName;
		
	}	
	//메소드 gs
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("--------------------");
		System.out.println("이름: " + super.getName());
		System.out.println("나이: " + super.getAge());
		System.out.println("학교: " + this.schoolName);
		System.out.println("--------------------");
	}

}
