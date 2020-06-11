package day13Work;

import java.util.*;

public class MovieManager {

	ArrayList<Movie> movies;
	Scanner scanner;
	
	MovieManager(){
		scanner = new Scanner(System.in);
		movies = new ArrayList<Movie>();
		
	}
	
	public void addMovie() {
		Movie movie = new Movie();
		movie.getMovieDetailsFromUser();
		movies.add(movie);
	}
	
	public void addMovies() {
		String choice = "No";
		do {
			addMovie();
			System.out.println("Do u want to add more movies?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no"));
		System.out.println("Movies added");
		System.out.println("--------------------");
	}
	
	Movie findMovieIndex(int id)
	{
		for (Movie movie : movies) {
			if(movie != null)
			{
				if(movie.getId()==id)
				{
					return movie;
				}
			}
		}
		return null;
	}
	
	public void compareMovies() {
		int id1=0,id2=0;
		Movie m1,m2;
		
		System.out.println("Please enter the first movie id to be compared");
		id1 = scanner.nextInt();
		m1 = findMovieIndex(id1);
		if(m1 == null)
		{
			System.out.println("No such movie please try again from start");
			compareMovies();
		}
		System.out.println("Please enter the second movie id to be compared");
		id2 = scanner.nextInt();
		m2 = findMovieIndex(id2);
		if(m2 == null)
		{
			System.out.println("No such movie please try again from start");
			compareMovies();
		}
		if(m1.equals(m2))
			System.out.println("The movies are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteMovie() {
		int id1=0;
		System.out.println("Please enter the movie id to be deleted");
		id1 = scanner.nextInt();
		Movie m1 = findMovieIndex(id1);
		if(m1 == null)
		{
			System.out.println("No such movie");
			System.out.println("No movie deleted");
		}
		else	
		{
			System.out.println("The movie to be deleted is ");
			System.out.println(m1);
			movies.remove(m1);
			System.out.println("Movie deleted");
			System.out.println("--------------------");
		}
			
	}
	public void printMovie() {
		int id1=0;
		System.out.println("Please enter the movie id to be printed");
		id1 = scanner.nextInt();
		Movie m1 = findMovieIndex(id1);
		System.out.println("The selected Movie details");
		if(m1 == null)
		{
			System.out.println("No such movie");
		}
		else
			System.out.println(m1);
		System.out.println("--------------------");
	}
	
	public void printAllMovies() {
		for (Movie movie : movies) {
			System.out.println(movie);
			System.out.println("--------------------");
		}
	}
	public void updateMovieDetails() {
		int id1=0;
		System.out.println("Please enter the movie id to be updated");
		id1 = scanner.nextInt();
		 Movie m1 = findMovieIndex(id1);
		System.out.println("The Movie details for updation");
		if(m1 == null)
		{
			System.out.println("No such movie");
		}
		else
		{
			System.out.println(m1);
			System.out.println("--------------------");
			scanner.nextLine();
			System.out.println("Please enter the movie name for updation");
			String name = scanner.nextLine();
			System.out.println("Please enter the movie duration for updation");
			float duration = scanner.nextFloat();
			m1.setName(name);
			m1.setDuration(duration);
			System.out.println("Update success");
			System.out.println("The updated movie details");
			System.out.println(m1);
			System.out.println("--------------------");
			
		}
	}
	void printMenu() {
		int userChoice = 0;
		do {
			System.out.println("--------------------");
			System.out.println("1. Adding a new movie");
			System.out.println("2. Updating the movie details");
			System.out.println("3. Deleting a movie");
			System.out.println("4. Printing all the movie details");
			System.out.println("5. Printing the given movie detail");
			System.out.println("6. Compare movies");
			System.out.println("7. Exit");
			System.out.println("--------------------");
			userChoice  = scanner.nextInt();
			switch (userChoice ) {
			case 1:
				addMovie();				
				break;
			case 2:
				updateMovieDetails();
				break;
			case 3:
				deleteMovie();
				break;
			case 4:
				printAllMovies();
				break;
			case 5:
				printMovie();
				break;
			case 6:
				compareMovies();
				break;
			case 7:
				System.out.println("exiting.....");
				break;
			default:
				System.out.println("Invalid option.. Try again");
				break;
			}
			
		} while (userChoice!=7);
		
	}
	public static void main(String[] args) {
		MovieManager movieManager = new MovieManager();
		movieManager.addMovies();
		movieManager.printMenu();

	}
}

