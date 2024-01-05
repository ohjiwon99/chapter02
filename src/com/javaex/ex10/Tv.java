package com.javaex.ex10;

import java.util.Iterator;

public class Tv {

	// 필드
	private int Channal;
	private int Volume;
	private boolean Power;

	// 생성자

	public Tv() { // 기본생성자
		System.out.println("Tv()");
	}

	public Tv(int Channal, int Volume, boolean Power) {// 특정 생성자
		this.Channal = Channal;
		this.Volume = Volume;
		this.Power = Power;
		System.out.println("Tv(int Channal,int Volume,boolean Power)");
	}

	/*
	 * public Tv(int Channal,int Volume) {//특정 생성자 this.Channal=Channal;
	 * this.Volume=Volume; System.out.println("Tv(int Channal,int Volume)"); }
	 * public Tv(int Channal,int Volume,boolean Power) { this(Channal,Volume);
	 * this.Power=Power; System.out.println("Tv(Channal,Volume,Power)"); }
	 */

	// 메소드 g
	public int getChannal(int Channal) {

		if (true) {
			this.Channal = Channal;
			Channal = 1;
		} else {

		}
		return Channal;
	}

	public int getVolume() {
		return Volume;
	}

	public boolean getPower() {
		return Power;
	}

	// 일반 메소드
	@Override
	public String toString() {
		return "Tv [Channal=" + Channal + ", Volume=" + Volume + ", Power=" + Power + "]";
	}

	public void status() {// 9. 티비정보출력
		System.out.println("채널:" + this.Channal + " 볼륨:" + this.Volume + " 파워:" + this.Power);
	}

	// 4. 화면 켜고 닫기
	public void Power(boolean on) {
		if (on == true) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	// 7. 채널 int channel(1~255유지) boolean up 오버로딩(1~255유지 1증감)
	// 채널 int channel(1~255유지)
	public void channel(int channel) {
		if (channel > 255) {
			// this.Channal=255;
			System.out.println(255);
		} else if (channel < 1) {
			// this.Channal=1;
			System.out.println(1);
		} else {
			this.Channal = Channal;
		}
	}

	// boolean up 오버로딩(1~255유지 1증감)
	public void channel(boolean up) {
		if (up == true) {
			// Channal+=1;
			System.out.println(1 + Channal);
		} else {
			// Channal-=1;
			System.out.println(1 - Channal);
		}
	}

	// 8. 채널 int voluem(1~100유지) boolean up 오버로딩(1~100유지 1증감)
	public void volume(int volume) {

		if (volume > 100) {
			this.Volume = 100;
		} else if (volume < 0) {
			this.Volume = 0;
		} else {
			this.Volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			Volume += 1;
		} else {
			Volume -= 1;
		}
	}

}