package com.javaex.ex18;

public class Shape {

	// 필드
	private String FillColor;
	private String LineColor;

	// 생성자
	public Shape() {

	}

	public Shape(String fillColor, String lineColor) {

		FillColor = fillColor;
		LineColor = lineColor;
	}

	// 메소드-g/s
	public String getFillColor() {
		return FillColor;
	}

	public void setFillColor(String fillColor) {
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
		return "Shape [FillColor=" + FillColor + ", LineColor=" + LineColor + "]";
	}

}
