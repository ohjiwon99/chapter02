package com.javaex.ex15;

public class PersonApp {

	public static void main(String[] args) {

		Person P01 = new Person("정우성", 45);
		System.out.println(P01.toString());

		Student S01 = new Student();
		S01.setName("정우성");// 부모
		S01.setage(45);     // 부모
		S01.setSchollName("서울고등학교");
		System.out.println(S01.toString());
		System.out.println(S01.toString());
		
		Student S02= new Student("정우성",45,"서울고등학교");

	}

}
