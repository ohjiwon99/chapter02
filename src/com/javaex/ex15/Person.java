package com.javaex.ex15;

public class Person {

	// 필드
	private String Name;
	private int age;

	// 생성자
	public Person() {

	}

	public Person(String Name, int age) {

		this.Name = Name;
		this.age = age;
		
	}

	// 메소드g/s

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		age = age;
	}

	// 일반메소드

	@Override
	public String toString() {
		return "Person [Name=" + Name + ", age=" + age + "]";
	}
	
	

}
