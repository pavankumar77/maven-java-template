package com.hashedin;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.io.IOUtils;

public class MovieManager {

	public Map<String, Movie> getMovies(InputStream movieStream)
			throws IOException {

		Map<String, Movie> movies = new HashMap<>();

		List<String> lines = IOUtils.readLines(movieStream);

		for (String line : lines) {
			Movie m = createMovie(line);
			movies.put(Integer.toString(m.getId()), m);
			// System.out.println(m);
		}
		return movies;
	}

	public Movie createMovie(String movieDetails) {

		StringTokenizer st = new StringTokenizer(movieDetails, "|");
		Movie m = new Movie();

		m.setId(Integer.parseInt(st.nextToken()));
		m.setMovieName(st.nextToken());
		m.setReleaseDate(st.nextToken());
		m.setUrl(st.nextToken());

		return m;

	}

	public Map<String, User> getUserdetail(InputStream userStream)
			throws IOException {

		Map<String, User> users = new HashMap<>();

		List<String> lines = IOUtils.readLines(userStream);

		for (String line : lines) {
			User m = createUser(line);
			users.put(Integer.toString(m.getUserid()), m);
			// System.out.println(m);
		}
		return users;
	}

	public User createUser(String userDetails) {

		StringTokenizer st = new StringTokenizer(userDetails, "|");
		User m = new User();

		m.setUserid(Integer.parseInt(st.nextToken()));

		return m;

	}

	public void addratings(InputStream ratingsStream, Map<String, User> User1,
			Map<String, Movie> Movies1) throws IOException {

		List<String> lines = IOUtils.readLines(ratingsStream);

		for (String line : lines) {

			Ratings r = createRatings(line);
			//System.out.println("...movie id.." + r.getMovieid());
			int movieId = r.getMovieid();
			Movie m = Movies1.get(Integer.toString(movieId));
			
			
			
			int addr = m.getTotalrating() + r.getRatings();
			int addt = m.getTotalviewers() + 1;

			m.setTotalrating(addr);
			m.setTotalviewers(addt);
			
			System.out.println(m.getTotalrating());

			
			int userId = r.getUserid();
			User u = User1.get(Integer.toString(userId));

			int addc = u.getCount() + 1;

			u.setCount(addc);

			
		}
	}

	public Ratings createRatings(String ratingsDetails) {

		StringTokenizer st = new StringTokenizer(ratingsDetails, " ");

		Ratings m = new Ratings();

		m.setUserid(Integer.parseInt(st.nextToken()));
		m.setMovieid(Integer.parseInt(st.nextToken()));
		m.setRatings(Integer.parseInt(st.nextToken()));
		m.setTimestamp(Integer.parseInt(st.nextToken()));

		
		
		return m;

	}

	public static void main(String[] args) throws IOException {

		MovieManager mm = new MovieManager();

		@SuppressWarnings("unused")
		Map<String, Movie> movieMap = mm.getMovies(mm.getClass()
				.getClassLoader().getResourceAsStream("movie.data"));
		Map<String, User> userMap = mm.getUserdetail(mm.getClass()
				.getClassLoader().getResourceAsStream("user.data"));

		mm.addratings(
			mm.getClass().getClassLoader()
				.getResourceAsStream("ratings.data"), userMap, movieMap);

	
	
		Movie m = movieMap.get("23");
		
	   System.out.println(m.getTotalrating());
	
	   MovieFreak mf = new MovieFreak();
	   
	   
	   mf.setUserMap(userMap);
	   mf.setMovieMap(movieMap);
	   mf.mostWatchedMovie();
	
	
	}
}



