package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		// 도형(부모)
		Shape s01 = new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		System.out.println(s01.toString());

		System.out.println("=============================================");

		// 배열
		Ractangle[] rArray = new Ractangle[2];
		
		Shape[] sArray = new Shape[0];

		// 사각형(자식)
		Ractangle r01 = new Ractangle(3, 3, "빨강", "검정");
		r01.setWidth(3);
		r01.setHeight(3);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
		System.out.println(r01.toString());

		System.out.println("=============================================");

		// 사각형(자식) -->잘 만들어져 있으면 이렇게만 작성해도 가능
		Ractangle r02 = new Ractangle(40, 40, "파랑", "검정");
		Ractangle r03 = new Ractangle(10, 50, "파랑", "검정");
		System.out.println(r02.toString());
		System.out.println(r03.toString());

		// 삼각형(자식)
		Triangle t01 = new Triangle(40, 40, "파랑", "검정");
		Triangle t02 = new Triangle(10, 50, "파랑", "검정");
		System.out.println(t01.toString());
		System.out.println(t02.toString());

		// 원형(자식)
		Circle c01 = new Circle(25, "파랑", "검정");
		Circle c02 = new Circle(15, "파랑", "검정");
		System.out.println(c01.toString());
		System.out.println(c02.toString());

		System.out.println("=============================================");

		rArray[0] = r01;
		rArray[1] = r02;

		for (int i = 0; i < rArray.length; i++) {
			System.out.println(rArray[i].toString());
		}

	}

}
