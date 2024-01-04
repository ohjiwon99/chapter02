package com.javaex.ex09;

public class PointApp {

	public static void main(String[] args) {
		
		Point P1 = new Point(2,2);
		Point P2= new Point(100,100);
		
		System.out.println(P1.toString());
		System.out.println(P2.toString());
		
		P1.draw();
		P2.draw();
		
		P1.draw(true);
		P1.draw(false);

	}

}
