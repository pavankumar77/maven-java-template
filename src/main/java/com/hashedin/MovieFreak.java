package com.hashedin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class MovieFreak {

	private List<Movie> movieList;
	private List<User> userList;

	public void setMovieMap(Map<String, Movie> movieMap) {

		this.movieList = new ArrayList<Movie>(movieMap.values());

	}

	public void setUserMap(Map<String, User> userMap) {

		this.userList = new ArrayList<User>(userMap.values());

	}

	public void mostActiveuser(List<User> ulist) {
		User u1 = new User();

		u1 = Collections.max(ulist, new Comparator<User>() {
			public int compare(User o1, User o2) {
				return Integer.compare(o1.getCount(), o2.getCount());

			}
		});

		System.out.println("mostActiveuser:" + u1.getUserid());

	}

	public void  topMovie(List<Movie> movielist, String category) {

		Movie m = new Movie();

		m = Collections.max(movielist, new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
				return Integer.compare(o1.getAverageratings(),
						o2.getAverageratings());
			}

		});

		System.out.println("TopMovie  " + category + "  :   "
				+ m.getMovieName());

		

	}

	public void mostWatchedMovie(List<Movie> movielist, String name) {

		Movie m = new Movie();

		m = Collections.max(movielist, new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
				return Integer.compare(o1.getTotalviewers(),
						o2.getTotalviewers());
			}

		});

		System.out.println("mostWatchedMovie   " + name + " :  "
				+ m.getMovieName());

		
	}

	public void highest(List<Movie> movieList,String name) {

		Movie m = new Movie();

		m = Collections.max(movieList, new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
				return Integer.compare(o1.getTotalrating(), o2.getTotalrating());
			}

		});
		System.out.println("highest Rated "+ name +":"+ m.getMovieName());

	

	}

	public List<Movie> yearFilter(List<Movie> movielist, String year) {

		List<Movie> yearList = new ArrayList<Movie>();

		for (Movie movie : movielist) {
			String r;
			r = movie.getReleaseDate();

			boolean b = year.regionMatches(0, r, 7, 4);
			if (b) {

				yearList.add(movie);
			}
		}

		return yearList;

	}

	public List<Movie> genreFilter(List<Movie> movieList, String genre) {

		int index = 0;
		List<Movie> genreList = new ArrayList<Movie>();

		index = genreindex(genre);

		for (Movie movie : movieList) {

			String b = movie.genre.get(index);

			if (Integer.parseInt(b) == 1) {
				genreList.add(movie);
			}

		}
		return genreList;
	}

	public void mostWatchedGenre(List<Movie> gList, String genre) {

		List<Movie> genreList = new ArrayList<Movie>();

		genreList = genreFilter(gList, genre);

		Movie m = new Movie();

	 mostWatchedMovie(genreList, genre);

		// System.out.println("mostWatchedMovie in Genre:" + m2.getMovieName());

	}

	public void highestRatedGenre(List<Movie> glist, String genre) {

		List<Movie> genreList = new ArrayList<Movie>();

		genreList = genreFilter(glist, genre);
		Movie m = new Movie();

		 highest(genreList,genre);

		
	}

	public void topMovieByYearAndGenre(List<Movie> glist, String year,
			String genre) {

		List<Movie> genreList = new ArrayList<Movie>();

		List<Movie> yearList = new ArrayList<Movie>();

		genreList = genreFilter(glist, genre);
		yearList = yearFilter(genreList, year);

		Movie m1 = new Movie();
		
		//year.concat(genre);

		 topMovie(yearList, year +" "+ genre);

//		System.out.println("TopMovie by year and genre:" + m1.getMovieName());

	}

	public void topmovieGenre(List<Movie> glist, String genre) {

		List<Movie> genreList = new ArrayList<Movie>();

		genreList = genreFilter(glist, genre);

		Movie m1 = new Movie();

		topMovie(genreList, genre);

	}

	public void topmovieYear(List<Movie> ylist, String year) {

		List<Movie> yearList = new ArrayList<Movie>();

		yearList = yearFilter(ylist, year);

		Movie m1 = new Movie();

		 topMovie(yearList, year);

	}

	public int genreindex(String genre) {

		int index = 0;

		switch (genre) {
		case "unknown":
			index = 0;
			break;
		case "Action":
			index = 1;
			break;
		case "Adventure":
			index = 2;
			break;
		case "Animation":
			index = 3;
			break;
		case "Children":
			index = 4;
			break;
		case "Comedy":
			index = 5;
			break;
		case "Crime":
			index = 6;
			break;
		case "Documentary":
			index = 7;
			break;
		case "Drama":
			index = 8;
			break;
		case "Fantasy":
			index = 9;
			break;
		case "Film-Noir":
			index = 10;
			break;
		case "Horror":
			index = 11;
			break;
		case "Musical":
			index = 12;
			break;
		case "Mystery":
			index = 13;
			break;
		case "Romance":
			index = 14;
			break;
		case "Sci-Fi":
			index = 15;
			break;
		case "Thriller":
			index = 16;
			break;
		case "War":
			index = 17;
			break;
		case "Western":
			index = 18;
			break;

		}

		return index;

	}

}
