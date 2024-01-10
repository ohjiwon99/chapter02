package com.javaex.ex23;

import java.io.IOException;

public class MyfileApp {

	public static void main(String[] args) {

		Myfile mf = new Myfile();

		
		//정상일때
		/*String str = mf.read("c:/aaa.txt");
		System.out.println(str);*/
		
		
		
		// 예외처리가 되었으나 처리방식이 원하는게 아님
		/*String str = mf.read2("c:/bbb.txt");
		System.out.println(star);*/
		
		
		try {
			mf.read3("c:/bbb.txt");
		} catch (IOException e) {
			System.out.println("can not find file");
		}
		
		

	}

}
