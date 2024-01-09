package com.javaex.ex16;

public class ColorPoint extends Point {

	// 필드
	private String Color;

	// 생성자
	public ColorPoint() {
		System.out.println("ColorPoint()");
	}
	public ColorPoint(String coior) {
		this.Color = Color;
		System.out.println("ColorPoint(1)");
	}// 1번

	public ColorPoint(int x, int y, String Color) {// 2번
		// 부모의 파라미터 2개있는 생성자 호출
		super(x, y);
		this.Color = Color;
		System.out.println("ColorPoint(3)");
	}

	/*
	  public ColorPoint(int x, int y, String Color) {//3번 이 방법도 있다! 
	  // 부모의 기본 생성자호출 
	  super(); super.setX(x); 
	  super.setY(y); 
	  this.Color = Color; 
	  }
	 */

	// 메소드-g/s
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		this.Color = color;
	}

	// 일반 메소드
	@Override
	public String toString() {
		return "ColorPoint [Color=" + Color + "]";
	}

	public void draw() {
		System.out.println("점=" + super.x + ", y=" + super.getY() + " Color=" + this.Color+"을 그렸습니다.");
	}
}