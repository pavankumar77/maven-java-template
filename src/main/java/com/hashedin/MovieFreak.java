package com.hashedin;

import java.util.ArrayList;
import java.util.Collections;
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
	
	
	
	
	public Movie mostPopularMovie(){
					
		Movie m1 = new Movie();
		
		for (Movie m21 :movieList){
	
			if( m21.getTotalrating()>m1.getTotalrating())
			{
				m1= m21;
			}
		}
		
		System.out.println(m1.getMovieName());
		
		
		return m1 ;
	}
}
