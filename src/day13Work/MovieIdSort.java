package day13Work;

import java.util.Comparator;

public class MovieIdSort implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getId()==o2.getId())
			return 0;
		else if(o1.getId()> o2.getId())
			return 1;
		else
			return -1;
	}

	

}
