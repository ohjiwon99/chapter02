package com.javaex.ex14;

public class Goods {

	// 필드

	private String name;
	private int price;

	// 생성자
	public Goods() {

	}

	// 디폴트생성자
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}

	// 메소드g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// 일반메소드
	public void showinfor() {
		System.out.println("상품명:" + this.name + ", 가격:" + this.price);
	}

	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
