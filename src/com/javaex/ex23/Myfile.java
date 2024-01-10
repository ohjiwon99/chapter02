package com.javaex.ex23;

import java.io.IOException;

public class Myfile {

	// 필드 x

	// 기본생성자 사용할거라 굳이 안씀

	// 메소드g/s x 필드가 없으니 g/s도 없음

	// 일반메소드
	// (정상적일때)
	public String read(String path) {

		String result = "학교종이 땡땡땡 어서 모이자";
		// path 에 있는 파일을 읽음(가정)
		return result;
	}
	


	// (파일이 없는 경우)--> 만드는쪽에서 처리
	public String read2(String path) {

		String result = " ";

		try {
			// 파일이 없는 상황을 강제로 발생
			throw new IOException();

		} catch (IOException e) {// path에 있는 파일이 없음(가정)
			System.out.println("경로에 파일이 없습니다.");
		}

		return result;
		
	}
	
	
	

	// (파일이 없는 경우)--> 사용하는쪽에서 알려줌
	public void read3(String path) throws IOException{
		
		String result = " ";
		// path에 있는 파일이 없음(가정)
		
		//파일이 없는 상황이 강제로 발생
		throw new IOException();
		

	}
	}


