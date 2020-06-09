package day11Work;

import java.util.Scanner;

public class MovieManager {

	Movie[] movies;
	Scanner scanner;
	int numberOfMovies;
	
	MovieManager(){
		scanner = new Scanner(System.in);
		movies = new Movie[10];
	}
	
	public void addMovie(int idx) {
		if(idx<10) {
		movies[idx] = new Movie();
		movies[idx].getMovieDetailsFromUser();
		}
		else
			System.out.println("Cannot add movie. Array is full");
	}
	
	public void addMovies() {
		int index = -1;
		String choice = "No";
		do {
			index++;
			addMovie(index);
			System.out.println("Do u want to add more movies?? Key in Yes for next entry and No for quiting");
			choice = scanner.nextLine();
		} while (!choice.toLowerCase().equals("no") && index<10);
		numberOfMovies = index;
		System.out.println("Movies added");
		System.out.println("--------------------");
	}
	
	int findMovieIndex(int id)
	{
		int index = -1;
		for (int i = 0; i <= numberOfMovies; i++) {
			if(movies[i].getId()==id)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public void compareMovies() {
		int id1=0,id2=0,idx1,idx2;
		System.out.println("Please enter the first movie id to be compared");
		id1 = scanner.nextInt();
		idx1 = findMovieIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such movie please try again from start");
			compareMovies();
		}
		System.out.println("Please enter the second movie id to be compared");
		id2 = scanner.nextInt();
		idx2 = findMovieIndex(id2);
		if(idx2==-1)
		{
			System.out.println("No such movie please try again from start");
			compareMovies();
		}
		if(movies[idx1].equals(movies[idx2]))
			System.out.println("The movies are just the same");
		else
			System.out.println("Not same");
		System.out.println("--------------------");
	}
	
	public void deleteMovie() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the movie id to be deleted");
		id1 = scanner.nextInt();
		idx1 = findMovieIndex(id1);
		if(idx1==-1)
		{
			System.out.println("No such movie");
			System.out.println("No movie deleted");
		}
		else	
		{
			System.out.println("The movie to be deleted is ");
			System.out.println(movies[idx1]);
			movies[idx1] = null;
			System.out.println("Movie deleted");
			System.out.println("--------------------");
		}
			
	}
	public void printMovie() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the movie id to be printed");
		id1 = scanner.nextInt();
		idx1 = findMovieIndex(id1);
		System.out.println("The selected Movie details");
		if(idx1==-1)
		{
			System.out.println("No such movie");
		}
		else
			System.out.println(movies[idx1]);
		System.out.println("--------------------");
	}
	
	public void printAllMovies() {
		for (int i = 0; i <= numberOfMovies; i++) {
			System.out.println(movies[i]);
			System.out.println("--------------------");
		}
	}
	public void updateMovieDetails() {
		int id1=0,idx1 =0;
		System.out.println("Please enter the movie id to be updated");
		id1 = scanner.nextInt();
		idx1 = findMovieIndex(id1);
		System.out.println("The Movie details for updation");
		if(idx1==-1)
		{
			System.out.println("No such movie");
		}
		else
		{
			System.out.println(movies[idx1]);
			System.out.println("--------------------");
			String name = scanner.nextLine();
			System.out.println("Please enter the movie name for updation");
			scanner.nextLine();
			System.out.println("Please enter the movie duration for updation");
			float duration = scanner.nextFloat();
			movies[idx1].setName(name);
			movies[idx1].setDuration(duration);
			System.out.println("Update success");
			System.out.println("The updated movie details");
			System.out.println(movies[idx1]);
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
				numberOfMovies++;
				addMovie(numberOfMovies);				
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
