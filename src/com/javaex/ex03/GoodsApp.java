package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {

        //camera
		Goods camera = new Goods();
		
		camera.setName("니콘");
		//camera.name="니콘"; private캡술화 (필드값 보호)
		camera.setPrice(400000);
		//camera.price=400000; private캡슐화 (필드값 보호)
		
		System.out.println(camera.gatName());
		//System.out.println(setname);
		System.out.println(camera.getPrice());
		//System.out.println(camera.price);
		
		//computer
        Goods computer = new Goods();
        computer.setName("LG그램");
        computer.setPrice(900000);
		
		System.out.println(computer.gatName());
		System.out.println(computer.getPrice());
		
		computer.showinfo();
		
	

	}

}
