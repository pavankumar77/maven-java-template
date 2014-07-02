package com.hashedin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
   	 public void testApp() throws IOException
	    {
	    	MovieManager mm = new MovieManager();
	    	Map<String, Movie> movieMap = mm.getMovies(mm.getClass().getClassLoader().getResourceAsStream("testdata.data"));
	        
	    	List<Movie> movieList = new ArrayList<Movie>(movieMap.values());
	    	
	    	Movie m = movieMap.get("1");
	      	MovieFreak mf = new MovieFreak();
			
			
	        
	        assertEquals(movieMap.size(), 3);
	      	assertEquals(m.getMovieName(), "Toy Story (1995)");		
	      	mf.mostWatchedMovie(movieList,"overall" );		
	      			
	    }
	 
	 public void testApp1() throws IOException
	    {
	    	MovieManager mm = new MovieManager();
	    	Map<String, Movie> userMap = mm.getMovies(mm.getClass().getClassLoader().getResourceAsStream("testdata.data"));
	        Movie m = userMap.get("1");
	     
	        assertEquals(userMap.size(), 3);
	      	assertEquals(m.getMovieName(), "Toy Story (1995)");		
	      			
	      			
	    }
	 
}
