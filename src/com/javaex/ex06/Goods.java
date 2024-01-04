package com.javaex.ex06;

public class Goods {
	
	// 필드
	private String name;
	private int price;
	
	// 생성자
	/*디폴트 값으로 생성자를 넣지 않아도 기본생성자가 생성되있다.
	   하지만 다른 생성자를 내가 만들시 기본생성자 사용 유무를 모르기에 프로그램 전산에서 자체적으로 없애버린다.
	   내가 기본 생성자도 필요하다면 따로 기본 생성자를 만들어주면 된다. */
	public Goods() {
		// 메모리에 올리는일(클래스를 인스턴스화)
		System.out.println("Goods()");
	}
	public Goods (String name) {
		// 메모리에 올리는일(클래스를 인스턴스화)
		this.name=name;//추가
		System.out.println("Goods(name)");
	}
	public Goods (String name,int price) {
		this(name); //this()==>this괄호는 다른 생성자를 부르는 문법
		this.name=name;
		this.price=price;
		System.out.println("Goods(name, price)");
	}
	// 메소드 g/s
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
    //일반 메소드
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
