package com.javaex.ex07;

import com.javaex.ex04.point;

public class PointApp {

	public static void main(String[] args) {

		point P0 = new point();
		P0.setX(2);
		P0.setY(5);
		System.out.println(P0.toString());

		Point P1 = new Point(2);
		P1.setY(22);
		System.out.println(P1.toString());

		Point P2 = new Point(100, 100);
		System.out.println(P2.toString());

		P0.draw();
		P1.draw();
		P2.draw();
		
		// 필드에 자료가 있기때문에 변형 가능
		System.out.println(P2.getX());
		P2.setX(500);
		System.out.println(P2.toString());

	}

}
