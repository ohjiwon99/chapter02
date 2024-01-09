package com.javaex.ex17;

public class Triangle {

	// 필드
	private int Width;
	private int Height;
	private String LineColor;
	private String FillColor;

	// 생성자
	public Triangle() {

	}

	public Triangle(int width, int height, String lineColor, String fillColor) {

		Width = width;
		Height = height;
		LineColor = lineColor;
		FillColor = fillColor;
	}

	// 메소드-g/s
	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public String getLineColor() {
		return LineColor;
	}

	public void setLineColor(String lineColor) {
		LineColor = lineColor;
	}

	public String getFillColor() {
		return FillColor;
	}

	public void setFillColor(String fillColor) {
		FillColor = fillColor;
	}

	// 일반 메소드
	public String toString() {
		return "Triangle [Width=" + Width + ", Height=" + Height + ", LineColor=" + LineColor + ", FillColor="
				+ FillColor + "]";
	}

	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====삼각형을 그렸습니다=========");
		System.out.println("밑변:" + Width);
		System.out.println("높이:" + Height);
		System.out.println("면색:" + FillColor);
		System.out.println("선색:" + LineColor);
		System.out.println("============================");
	}

}
