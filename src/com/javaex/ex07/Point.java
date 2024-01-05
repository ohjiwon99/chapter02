package com.javaex.ex07;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
		// 메모리에 올리는 일
		System.out.println("point()");
	}

	public Point(int x) {
		// 메모리에 올리는 일
		this.x = x;
		System.out.println("point(int x)");
	}

	/*
	 * public Point(int y) { //메모리에 올리는 일 ==> (위의 값과 변수와 자료형이 같기 때문에 안됌 뒤의 x,y로는 구별
	 * 못함) this.y= y; }
	 */

	public Point(int x, int y) {
		this(x);
		this.y = y;
		System.out.println("Point(x,y)");
	}

	// 메소드 g/s
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 일반 메소드
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {

		System.out.println("점[x=" + this.x + ", y=" + this.y + "]을 그렸습니다.");

	}

}
