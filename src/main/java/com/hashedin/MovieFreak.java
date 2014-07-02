package com.hashedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class MovieFreak {
	
	
	private	List<Movie> movieList; 
	private	List<User> userList;

	public void setMovieMap(Map<String, Movie> movieMap) {
		
		
		this.movieList = new ArrayList<Movie>(movieMap.values());

	}

	public void setUserMap(Map<String,User> userMap) {
		
		this.userList = new ArrayList<User>(userMap.values());
		
		}
	
	
	
	
	public Movie mostWatchedMovie(){
					
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		for (Movie m21 :movieList){
	
			if( m21.getTotalviewers()>m1.getTotalviewers())
			{
				m1= m21;
			}
		}
		
		System.out.println(m1.getMovieName());
		
		
		m2=Collections.max(movieList,new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
			    return Integer.compare(o1.getTotalviewers(), o2.getTotalviewers());
			}
			
		});
		System.out.println(m2.getMovieName());
		
		return m1 ;
	}
}
