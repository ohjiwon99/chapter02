package com.javaex.ex16;

public class PointApp {

	public static void main(String[] args) {
		
		Point P = new Point(4, 4);
		//System.out.println(P.toString());
		P.draw();
		
		Point P1 = new Point(10, 10);
		P1.draw();
		
		ColorPoint Cp1= new ColorPoint();
		Cp1.setX(99);
		Cp1.setY(99);
		Cp1.setColor("red");
		Cp1.draw();
		Cp1.x=3;
		
		//System.out.println(Cp1.toString());
		
		
		 //ColorPoint Cp2= new ColorPoint(10,10, "blue");
		 //System.out.println(Cp2.showinfo());

	}

}
