package com.javaex.ex20;

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

		// 사각형의 가로값 가져오기->형변환
		System.out.println(((Ractangle) sArray[0]).getWidth());

		// 원의 반지름 구하기
		System.out.println(((Circle) sArray[2]).getRadius());

		// 전체면적구하기
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i].area());
			
		}

	}

}
