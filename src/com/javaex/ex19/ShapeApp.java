package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		 * Ractangle r01 = new Ractangle(2,2,"빨강","빨강");
		 * System.out.println(r01.getWidth());
		 */

		Shape[] sArray = new Shape[3];

		// 부모만 보인다. 자식쪽은 사용 못함
		Shape s01 = new Ractangle(20, 20, "빨강", "노랑");// 사각형
		Shape s02 = new Triangle(100, 100, "빨강", "빨강");// 삼각형
		Shape s03 = new Circle(10, "주황", "빨강");// 원형

		sArray[0] = s01;
		sArray[1] = s02;
		sArray[2] = s03;

		for (int i = 0; i < sArray.length; i++) {
			sArray[i].draw();
			
		}

	}

}
