package day8Work;
import java.util.Scanner;
//POJO
public class CD {

	private String id;
	private float price;
	private boolean isAvailable;
	Movie movie;
	Scanner scanner;
	
	
	CD(){
		scanner = new Scanner(System.in);
		isAvailable = true;
		movie = null;
	}
	CD(float price){
		scanner = new Scanner(System.in);
		this.price = price;
		isAvailable = true;
		movie = null;
	}
	CD(float price,Movie movie){
		scanner = new Scanner(System.in);
		this.price = price;
		isAvailable = true;
		this.movie = movie; 
	}
	CD(String id,float price,Movie movie){
		scanner = new Scanner(System.in);
		this.id = id;
		this.price = price;
		isAvailable = true;
		this.movie = movie; 
	}
	
	
	
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	void getCDDetailsFromUser() {
		System.out.println("Please enter the cd id");
		id = scanner.nextLine();
		System.out.println("Please enter the cd price");
		price = scanner.nextFloat();
	}
	void getCDDetailsFromUser(Movie movie) {
		System.out.println("Please enter the cd id");
		id = scanner.nextLine();
		System.out.println("Please enter the cd price");
		price = scanner.nextFloat();
		this.movie = movie;
	}
	
}
