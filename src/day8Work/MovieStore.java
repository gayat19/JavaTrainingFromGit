package day8Work;

//Array of our Type
public class MovieStore {

	Movie[] movies;//array of our own type
	
	MovieStore(){
		movies = new Movie[3];//will create an array of reff
	
	}
	void addMovie() {
		for (int i = 0; i < movies.length; i++) {
			movies[i] = new Movie();//creating an object for every ref using the iteration
			movies[i].getMovieDetailsFromUser();
		}
	}
	
	void listAllMovies() {
		for (int i = 0; i < movies.length; i++) {
			movies[i].printMovieDetails();
		}
	}
	
	public static void main(String[] args) {
		MovieStore movieStore = new MovieStore();
		movieStore.addMovie();
		movieStore.listAllMovies();

	}

}
