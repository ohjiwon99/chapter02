package com.javaex.ex12;

public class GoodsApp {

	// 필드

	// 생성자

	// 메소드g/s

	// 일반메소드

	public static void main(String[] args) {
		System.out.println(Goods.count);

		Goods camera = new Goods("니콘", 400000);
		System.out.println(camera.toString());

		Goods computer = new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());

		Goods cup = new Goods("머그컵", 2000);
		System.out.println(cup.toString());

		// cup.setCount(100); //setCount() 없는게 좋다
		// System.out.println(cup.toString());

		// System.out.println(cup.getCount());
		// System.out.println(computer.getCount());
		System.out.println(camera.count);

		System.out.println(Goods.count);

		// Goods camera = new Goods("니콘",400000);
		// Goods comouter=new Goods("LG그램",900000);
		// Goods cup=new Goods("머그컵",2000);

	}

}
