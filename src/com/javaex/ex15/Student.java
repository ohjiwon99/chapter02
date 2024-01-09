package com.javaex.ex15;

public class Student extends Person {

	// 필드
	private String schollName;

	// 생성자
	public Student() {
		System.out.println("Student()");
	}

	/*
	 public Student(String schollName) {
	 this.schollName = schollName; }
	 */

	public Student(String Name, int age, String schollName) {
		// 부모의 생성자 호출 super
		// Name.age 부모
		super(Name, age);

		// 자신메모리에 올리는일
		// schollName 자신
		this.schollName = schollName;

	}

	// 메소드-g/s
	public String getSchollName() {
		return schollName;
	}

	public void setSchollName(String schollName) {
		this.schollName = schollName;
	}

	// 일반메소드
	@Override
	public String toString() {
		return "Student [schollName=" + schollName + "]";
	}

}
