package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {

		// 배열만들기
		Drawable[] dArray = new Drawable[4];

		// 그릴 수 있는애 Drawable
		// 사각형
		Drawable d01 = new Ractangle(100, 100, "빨강", "빨강");
		// d01.draw();

		// 점
		Drawable d02 = new Point(2, 2);
		// d02.draw();

		// 삼각형
		Drawable d03 = new Triangle(100, 100, "빨강", "빨강");
		// d03.draw();

		// 원
		Drawable d04 = new Circle(10, "주황", "빨강");
		// d04.draw();

		// 배열에 주소넣기
		dArray[0] = d01;
		dArray[1] = d02;
		dArray[2] = d03;
		dArray[3] = d04;

		for (int i = 0; i < dArray.length; i++) {
			dArray[i].draw();
		}

		// 사각형의 가로값
		System.out.println(((Ractangle) dArray[0]).getWidth());

		// 원의 넓이 구하기
		System.out.println(((Circle) dArray[3]).area());
		System.out.println(((Shape) dArray[3]).area());

		// 점의 값
		System.out.println(((Point) dArray[1]).getY());

		// 삼각형 밑변
		System.out.println(((Triangle) dArray[2]).getWidth());

		// 전체에서 도형의 넓이를 출력
		for (int i = 0; i < dArray.length; i++) {
			if (dArray[i] instanceof Shape) {// 현재 배열의 방(주소)를 따라가면 Shape이 있다면
				System.out.println(((Shape) dArray[i]).area());

			}
		}

	}
}
