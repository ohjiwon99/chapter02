package com.javaex.ex05;

public class songApp {

	public static void main(String[] args) {
		
		song S1 = new song(); 
		S1.settitle("좋은날");
		S1.setartist("아이유");
		S1.setalbum("Real");
		S1.setcomposer("이민수 작곡");
		S1.setyeare(2010);
		S1.settrack("3번 track");
	
		S1.showinfo();
		
		song S2 = new song(); 
		S2.settitle("거짓말");
		S2.setartist("BIGBANG");
		S2.setalbum("Always");
		S2.setcomposer("G-DRAGON 작곡");
		S2.setyeare(2007);
		S2.settrack("2번 track");
	
		S2.showinfo();
		
		song S3 = new song(); 
		S3.settitle("벚꽃엔딩");
		S3.setartist("버스커버스커");
		S3.setalbum("버스커버스커1집");
		S3.setcomposer("장범준작곡");
		S3.setyeare(2012);
		S3.settrack("4번 track");
	
		S3.showinfo();
		
		

	}

}
