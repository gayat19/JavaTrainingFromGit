package day13Work;

import java.util.Comparator;



public class MovieDurationSort implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getDuration()==o2.getDuration())
			return 0;
		else if(o1.getDuration()> o2.getDuration())
			return 1;
		else
			return -1;
		//return Float.compare(o1.getDuration(), o2.getDuration());
	}

}
