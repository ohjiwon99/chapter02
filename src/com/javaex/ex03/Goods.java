package com.javaex.ex03;

public class Goods {
	
	
	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드-gs
	public void setName(String name) {
		this.name = name; 
	}
	
	public void setPrice(int Price) {
		this.price = Price;
	}
	
	public String gatName( ) {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	//일반 메소드
	public void showinfo() {
		System.out.println("---------------------------------");
		System.out.println("상품명"+this.name+", 가격"+this.price);
		System.out.println("---------------------------------");
	}
	
	
}

       

// 변수의 이름이 헷갈릴 경우 명확하게 쓰기! 
// this(본인 자신)== ex) camera.computer.....

/* public void setName(String name) {
	this.name = name; 
}

   public void setPrice(int Price) {
	this.price = Price;
} */ 






