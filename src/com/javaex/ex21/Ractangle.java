package com.javaex.ex21;

public class Ractangle extends Shape implements Drawable{ // extends Shape 해줘야 부모 자식이 나타나짐

	// 필드
	private int Width;
	private int Height;

	// 생성자
	public Ractangle() {
		// super();
	}

	public Ractangle(int width, int height, String fillColor, String lineColor) {

		// 방법은 두가지!

		/*
		 * super(); super.setFillColor(fillColor); super.setLineColor(lineColor);
		 * 
		 * this.Width = width; this.Height = height;
		 */

		super(fillColor, lineColor);

		this.Width = width;
		this.Height = height;

	}

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

	public String toString() {
		return "Ractangle [Width=" + Width + ", Height=" + Height + ", getFillColor=" + getFillColor()
				+ ", getLineColor=" + getLineColor() + "]";
	}

	public void draw() {
		// 사각형을 시각화 하는 복잡한 로직작동
		System.out.println("====사각형을 그렸습니다=========");
		System.out.println("가로:" + Width);
		System.out.println("세로:" + Height);
		System.out.println("면색:" + super.FillColor); // protected String FillColor;(계획이 있다면 부모쪽에서 protected 열어주면 가능)
		System.out.println("선색:" + super.getLineColor());// private String LineColor;
		System.out.println("============================");
	}

	public double area() {

		return Width * Height;
	}
}
