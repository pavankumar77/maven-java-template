import java.io.IOException;
import java.util.Map;

import com.hashedin.Movie;
import com.hashedin.MovieManager;

import junit.framework.Test;
import junit.framework.TestCase;


public class test extends TestCase {
	
	
	public void movieTest () throws IOException{
	MovieManager mm = new MovieManager();
	Map<String, Movie> movieMap = mm.getMovies(mm.getClass().getClassLoader().getResourceAsStream("testdata.data"));
     
	
	
	assertEquals(movieMap.size(),1682);
	
	
	}
	
	
	
	
	
}