package com.javaex.ex18;

public class Triangle extends Shape {

	// 필드
	private int Width;
	private int Height;

	// 생성자
	public Triangle() {

	}

	public Triangle(int width, int height, String fillColor, String lineColor) {
		super(fillColor, lineColor);
		Width = width;
		Height = height;
	}

	// 메소드 g/s
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

	// 일반메소드
	public String toString() {
		return "Triangle [Width=" + Width + ", Height=" + Height +  ", getFillColor=" + getFillColor() + ", getLineColor=" + getLineColor() + "]";
	}

}
