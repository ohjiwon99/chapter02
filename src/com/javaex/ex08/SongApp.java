package com.javaex.ex08;

import com.javaex.ex05.song;

public class SongApp {

	public static void main(String[] args) {
		
		Song IU= new Song();
		IU.setTitle("좋은날");
		IU.setArtist("아이유");
		IU.setAlbum("Real");
		IU.setComposer("이민수 작곡");
		IU.setTrack("3번 track");
		IU.setYear(2010);
		
		System.out.println(IU.toString());
		
		
	 /*song BB = new song();
		System.out.println(BB.toString());*/

	

	}

}
