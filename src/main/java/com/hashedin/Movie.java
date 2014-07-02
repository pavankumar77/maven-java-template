package com.hashedin;

import java.util.ArrayList;

public class Movie {

	int id;
	String movieName;
	String releaseDate;
	String url;
	int totalrating;
	int totalviewers;
	int averageratings;

	public int getAverageratings() {
		return averageratings;
	}

	public void setAverageratings(int averageratings) {
		this.averageratings = averageratings;
	}

	public ArrayList<String> genre = new ArrayList<String>();

	@Override
	public String toString() {
		return "Movie [id=" + id + ", movieName=" + movieName
				+ ", releaseDate=" + releaseDate + ", url=" + url
				+ ", totalrating=" + totalrating + ", totalviewers="
				+ totalviewers + ", genre=" + genre + ", getId()=" + getId()
				+ ", getMovieName()=" + getMovieName() + ", getReleaseDate()="
				+ getReleaseDate() + ", getUrl()=" + getUrl()
				+ ", getTotalrating()=" + getTotalrating()
				+ ", getTotalviewers()=" + getTotalviewers() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

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

	public void setGenre(int index, String value) {

		this.genre.add(index, value);
	}

}
