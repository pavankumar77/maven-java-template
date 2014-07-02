package com.hashedin;

public class Movie {
 
	private int  id;
	private String movieName ;
	private String releaseDate;
	private String url;
    private int totalrating ;
	private int totalviewers;
    
    
    
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
	
	public int getTotalrating() {
		return totalrating;
	}
	public void setTotalrating(int totalrating) {
		this.totalrating = totalrating;
	}
	public int getTotalviewers() {
		return totalviewers;
	}
	public void setTotalviewers(int totalviewers) {
		this.totalviewers = totalviewers;
	}
		
	
}
