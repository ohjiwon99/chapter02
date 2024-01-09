package com.javaex.ex17;

public class shapeApp {

	public static void main(String[] args) {
		// 배열
		Ractangle[] rArray = new Ractangle[3];
		Triangle[] tArray = new Triangle[3];
		Circle[] cArray = new Circle[3];

		// 메모리에 올린값
		Ractangle r01 = new Ractangle(5, 10, "파랑", "빨강");
		Ractangle r02 = new Ractangle(10, 10, "노랑", "노랑");
		Ractangle r03 = new Ractangle(20, 20, "빨강", "빨강");

		Triangle t01 = new Triangle(10, 5, "주황", "초록");
		Triangle t02 = new Triangle(20, 30, "보라", "연두");
		Triangle t03 = new Triangle(10, 30, "핑크", "보라");

		Circle c01 = new Circle(5, 10, "보라");
		Circle c02 = new Circle(10, 30, "핑크");
		Circle c03 = new Circle(5, 15, "연두");

		// 배열에 메모리 올려주기
		rArray[0] = r01;
		rArray[1] = r02;
		rArray[2] = r03;

		tArray[0] = t01;
		tArray[1] = t02;
		tArray[2] = t03;

		cArray[0] = c01;
		cArray[1] = c02;
		cArray[2] = c03;

		// 배열반복
		for (int i = 0; i < rArray.length; i++) {
			rArray[i].draw();
		}

		for (int i = 0; i < tArray.length; i++) {
			tArray[i].draw();

		}

		for (int i = 0; i < cArray.length; i++) {
			cArray[i].draw();
		}
		// 출력
		// System.out.println(r01);
		// System.out.println(r02);
		// System.out.println(r03);
		// r01.draw();
		// r02.draw();
		// r03.draw();

	}

}
