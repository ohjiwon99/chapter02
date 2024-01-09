package com.javaex.ex17;

public class Circle {

	// 필드
	private int radius;
	private int FillColor;
	private String LineColor;

	// 생성자
	public Circle() {

	}

	public Circle(int radius, int fillColor, String lineColor) {
		super();
		this.radius = radius;
		FillColor = fillColor;
		LineColor = lineColor;
	}

	// 메소드-g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public int getFillColor() {
		return FillColor;
	}

	public void setFillColor(int fillColor) {
		FillColor = fillColor;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}

	// 일반 메소드
	public String toString() {
		return "Circle [radius=" + radius + ", FillColor=" + FillColor + ", LineColor=" + LineColor + "]";
	}

	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====원형을 그렸습니다=========");
		System.out.println("반지름:" + radius);
		System.out.println("면색:" + FillColor);
		System.out.println("선색:" + LineColor);
		System.out.println("============================");
	}

}
