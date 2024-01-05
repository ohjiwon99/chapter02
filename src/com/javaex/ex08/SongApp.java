package com.javaex.ex08;

import com.javaex.ex05.song;

public class SongApp {

	public static void main(String[] args) {
		
		Song IU= new Song("좋은날","아이유","Real","이민수작곡",3,2010);
		//System.out.println(IU.toString());
		

	    Song BB = new Song("거짓말","BIGBANG","Always","G-DRAGON",2,2007);
		//System.out.println(BB.toString());
	    
	    Song BSK= new Song("벚꽃엔딩","버스커버스커","버스커버스커1집","장범준",4,2012);
	    //System.out.println(BSK.toString());
	    
	    IU.showInfo();
	    BB.showInfo();
	    BSK.showInfo();

	

		System.out.println(IU.toString());
		
		
	 

	}

}
