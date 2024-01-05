package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {
		// 배열만들기
		Goods[] goodsArray = new Goods[5];

		// 상품만들기
		Goods camera = new Goods("니콘", 400000);
		Goods comouter = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 2000);

		// 배열에 상품 넣기
		goodsArray[0] = camera;
		goodsArray[1] = comouter;
		goodsArray[2] = cup;

		System.out.println("===============================");// 1번 방법
		System.out.println(camera.getName());
		System.out.println(goodsArray[0]);

		System.out.println(comouter.getName());
		System.out.println(goodsArray[1]);

		System.out.println(cup.getName());
		System.out.println(goodsArray[2]);

		System.out.println("===============================");// 2번 방법
		camera.showinfor();
		comouter.showinfor();
		cup.showinfor();

		System.out.println("===============================");// 3번 방법
		goodsArray[0].showinfor();
		goodsArray[1].showinfor();
		goodsArray[2].showinfor();

		System.out.println("===============================");
		int count = 0;
		for (int i = 0; i < goodsArray.length; i++) {
			if (goodsArray[i] != null) {// 주소가 있으면
				// 카운트+
				goodsArray[i].showinfor();

				count = count + 1;
				count += 1;

				count++;

			}
		}
		System.out.println("전체상품갯수:" + count);

	}

}
