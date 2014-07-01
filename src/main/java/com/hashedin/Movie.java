package com.hashedin;

public class Movie {
 
	private int  id;
	private String movieName ;
	private String releaseDate;
	private String url;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	
	public String toString() {
		return "movie [id=" + id + ", movieName=" + movieName
				+ ", releaseDate=" + releaseDate + ", url=" + url + "]";
	}
	
	
	
}
