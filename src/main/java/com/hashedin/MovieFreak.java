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

	public Movie mostWatchedMovie() {

		// Movie m1 = new Movie();
		Movie m2 = new Movie();
		// for (Movie m21 :movieList){

		// if( m21.getTotalviewers()>m1.getTotalviewers())
		// {
		// m1= m21;
		// }
		// }

		// System.out.println(m1.getMovieName());

		m2 = Collections.max(movieList, new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
				return Integer.compare(o1.getTotalviewers(),
						o2.getTotalviewers());
			}

		});

		System.out.println("mostWatchedMovie:" + m2.getMovieName());

		return m2;
	}

	public User mostActiveuser() {
		User u1 = new User();

		u1 = Collections.max(userList, new Comparator<User>() {
			public int compare(User o1, User o2) {
				return Integer.compare(o1.getCount(), o2.getCount());

			}
		});

		System.out.println("mostActiveuser:" + u1.getUserid());

		return u1;
	}

	public Movie topMovie(String year) {

		List<Movie> List = new ArrayList<Movie>();

		List = genreFilter(year);

		Movie m2 = new Movie();
		m2 = Collections.max(List, new Comparator<Movie>() {

			public int compare(Movie o1, Movie o2) {
				return Integer.compare(o1.getAverageratings(),
						o2.getAverageratings());
			}

		});

		System.out.println("mostPopularMovie:" + m2.getMovieName());

		return m2;

	}

	public List<Movie> yearFilter(String year) {

		List<Movie> yearList = new ArrayList<Movie>();

		// System.out.println(" Year" + year);

		for (Movie movie : movieList) {
			String r;
			r = movie.getReleaseDate();
			// System.out.println("Release : " + r);
			boolean b = year.regionMatches(0, r, 7, 4);
			// System.out.println(" Matches " + b);
			if (b) {

				yearList.add(movie);
			}
		}
		// System.out.println(yearList);

		return yearList;

	}

	public List<Movie> genreFilter(String genre) {

		int index = 0;
		List<Movie> genreList = new ArrayList<Movie>();

		index = genreindex(genre);
	//	System.out.println(index);
		for (Movie movie : movieList) {

			String b = movie.genre.get(index);
		//	System.out.println(b);
			if (Integer.parseInt(b) == 1) {

			//	System.out.println("yes");
				genreList.add(movie);
				// System.out.println(genreList);
			}

		}
		// System.out.println(genreList);
		return genreList;
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
		System.out.println("hi");
		return index;

	}

}
