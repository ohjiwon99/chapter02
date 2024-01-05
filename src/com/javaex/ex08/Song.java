package com.javaex.ex08;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int track;
	private int year;
	
	//생성자
	public Song () {
				
		//System.out.println("Song()");

	}
	public Song (String title, String artist,String album,String composer,int track) {
		
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.track=track;
		
		//System.out.println("Song (title,artist,album,composer,track,year)");
	}
		
	public Song(String title,String artist,String album,String composer,int track, int year) {
			this(title,artist,album,composer,year);
			this.year=year;
			//System.out.println("Song(title,artist,album,composer,track,year)");
	}
	
	
	//메소드 g/s
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//일반 메소드
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", track=" + track + "]";
	}
	
	public void showInfo() {
		System.out.println("title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer
				+ ", track=" + track );
	}
	

	

}
