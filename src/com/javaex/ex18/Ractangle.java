package com.javaex.ex18;

public class Ractangle extends Shape { // extends Shape 해줘야 부모 자식이 나타나짐

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
		 * super(); super.setFillColor(fillColor); 
		 * super.setLineColor(lineColor);
		 * 
		 * this.Width = width; 
		 * this.Height = height;
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
		return "Ractangle [Width=" + Width + ", Height=" + Height + ", getFillColor=" + getFillColor() + ", getLineColor=" + getLineColor() + "]";
	}

}
