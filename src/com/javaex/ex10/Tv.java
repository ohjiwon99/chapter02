package com.javaex.ex10;

import java.util.Iterator;

public class Tv {
	
	
	//필드
	private int Channal;
	private int Volume;
	private boolean Power;
	
	//생성자
	
	public Tv() { //기본생성자
		System.out.println("Tv()"); 
	}
	public Tv(int Channal,int Volume,boolean Power) {//특정 생성자
		this.Channal=Channal;
		this.Volume=Volume;
		this.Power=Power;
		System.out.println("Tv(int Channal,int Volume,boolean Power)");
	}
	
	/*public Tv(int Channal,int Volume) {//특정 생성자
		this.Channal=Channal;
		this.Volume=Volume;
		System.out.println("Tv(int Channal,int Volume)");
	}
	public Tv(int Channal,int Volume,boolean Power) {
		this(Channal,Volume);
		this.Power=Power;
		System.out.println("Tv(Channal,Volume,Power)");
	}*/
	
	//메소드 g
	public int getChannal(int Channal) {
		
		if (true) {
			this.Channal = Channal;
			Channal = 1;
		}else {
			
		}
		return Channal;
	}
	
	public int getVolume() {
		return Volume;
	}
	
	public boolean getPower() {
		return Power;
	}
	 
		
	//일반 메소드
	@Override
	public String toString() {
		return "Tv [Channal=" + Channal + ", Volume=" + Volume + ", Power=" + Power + "]";
	}
	public void status() {
		System.out.println("채널:"+this.Channal+" 볼륨:"+this.Volume+" 파워:"+this.Power);
	}
	
	
	// 4. 화면 켜고 닫기
	public void Poweroff(boolean Power) {
		if (Power==true) {
			System.out.println("전원이 켜졌습니다.");
		}else {
			System.out.println("전원이 꺼졌습니다.");
		}}
		
		
	//7. 채널  int channel(1~255유지)  boolean up 오버로딩(1~255유지 1증감)
	
	 //메소드 구현 (1~255 유지) 
	
	
	
	
	
	
	
	/*void channel( boolean up ) //메소드 오버로딩 (1~255 유지, 1씩 증감)
	void volume( int voluem ) //메소드 구현 ( 0 ~ 100 유지 )
	void volume( boolean up ) //메소드 오버로딩 (0 ~ 100 유지, 1씩 증감)
	void status()// 메소드 구현( TV 정보 출력)*/
		
		
		
	//8. 채널  int  voluem(1~100유지)  boolean up 오버로딩(1~100유지 1증감)
	//9. 티비정보출력
	

	
	
	

}
