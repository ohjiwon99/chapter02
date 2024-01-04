package com.javaex.ex05;

public class song {

	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;

	public void settitle(String title) {
		this.title = title;
	}

	public void setartist(String artist) {
		this.artist = artist;
	}

	public void setalbum(String album) {
		this.album = album;
	}

	public void setcomposer(String composer) {
		this.composer = composer;
	}

	public void setyeare(int year) {
		this.year = year;
	}

	public void settrack(String track) {
		this.track = track;
	}

	public String gettitle() {
		return title;
	}

	public String getartist() {
		return artist;
	}

	public String getalbum() {
		return album;
	}

	public String getcomposer() {
		return composer;
	}

	public int getyear() {
		return year;
	}

	public String gettrack() {
		return track;
	}
    
	//일반 메소드
	public void showinfo() {
		System.out
				.println("-------------------------------------------------------------------------------------------");
		System.out.println(this.artist + "," + this.title + ",(" + this.album + "," + this.year + "," + this.track + ","
				+ this.composer + ")");
		System.out
				.println("-------------------------------------------------------------------------------------------");
	}
    //개발자 확인용 (alt+shift+s)==>to string
	@Override
	public String toString() {
		return "song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}

}
