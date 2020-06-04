package day8Work;

import java.util.Scanner;

//POJO Class
public class Movie {
	private int id;
	private String name;
	private float duration;
	
	Scanner scanner;
	
	//default
	Movie(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	Movie(String name,float duration){
		scanner = new Scanner(System.in);
		this.name = name;
		this.duration = duration;
	}
	
	Movie(int id,String name, float duration)
	{
		scanner = new Scanner(System.in);
		this.id = id;
		this.name = name;
		this.duration = duration;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDuration() {
		return duration;
	}
	public void setDuration(float duration) {
		this.duration = duration;
	}
	void getMovieDetailsFromUser() {
		System.out.println("Please enter the movie id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the movie name");
		name = scanner.nextLine();
		System.out.println("Please enter the movie duration");
		duration = scanner.nextFloat();
	}
	void printMovieDetails() {
		System.out.println("Movie ID "+id+"\nMovie Name "+name+"\nMovie Duration "+duration);
		System.out.println("------------------------------------");
	}
}
