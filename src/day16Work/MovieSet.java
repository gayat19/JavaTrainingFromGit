package day16Work;

import java.util.*;
import day13Work.*;

public class MovieSet {
	
	ArrayList<Movie> movies;
	
	public MovieSet() {
		movies = new ArrayList<Movie>();
	}
	
	void addMovieInSet() {
		Movie movie = new Movie(101,"TTT",201.2f);
		//movie.getMovieDetailsFromUser();
		movies.add(movie);
		movie = new Movie(102,"GGG",123.22f);
		movies.add(movie);
	}
	
	void printAllMovies() {
		TreeSet<Movie> sortedMovies = new TreeSet<Movie>(movies);
		movies = new ArrayList<Movie>(sortedMovies);
		System.out.println("Sorted by name");
		System.out.println(movies);
		System.out.println("Sorted by ID");
		movies.sort(new MovieIdSort());
		System.out.println(movies);
		System.out.println("Sorted by Duration");
		movies.sort(new MovieDurationSort());
		System.out.println(movies);
	}
	public static void main(String[] args) {
		MovieSet movieSet = new MovieSet();
		movieSet.addMovieInSet();
		movieSet.printAllMovies();

	}

}
