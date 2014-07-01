package com.hashedin;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;


public class MovieManager {	
	          
public Map<String,Movie>getMovies(InputStream movieStream) throws IOException{
	
		Map <String,Movie> movies = new HashMap<>() ;
	
		 List<String> lines = IOUtils.readLines(movieStream);
		 
		 
		 for(String line :lines )
		 {
			 Movie m = createMovie(line);
				movies.put(Integer.toString(m.getId()), m);
		// System.out.println(m);
		 }
return null;		
}
   
		 
	public Movie createMovie(String movieDetails)	{
	
	        StringTokenizer st = new StringTokenizer(movieDetails,"|");
			Movie m = new Movie();
			
				 m.setId(Integer.parseInt(st.nextToken()));
				 m.setMovieName(st.nextToken());
				 m.setReleaseDate(st.nextToken());
				 m.setUrl(st.nextToken());
            
				 return m;
			 
  		}
	 
	 
public static void main (String [] args) throws IOException{		

	
	MovieManager mm = new MovieManager();
	Map<String, Movie> movieMap = mm.getMovies(mm.getClass().getClassLoader().getResourceAsStream("movie.data"));

   }


}
	

