package com.hashedin;

import java.io.IOException;
import java.util.Map;

import junit.framework.TestCase;

public class AppTest 
    extends TestCase
{
   	 public void testApp() throws IOException
	    {
	    	MovieManager mm = new MovieManager();
	    	Map<String, Movie> movieMap = mm.getMovies(mm.getClass().getClassLoader().getResourceAsStream("testdata.data"));
	        Movie m = movieMap.get("1");
	      	
	        assertEquals(movieMap.size(), 3);
	      	assertEquals(m.getMovieName(), "Toy Story (1995)");		
	      			
	      			
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
