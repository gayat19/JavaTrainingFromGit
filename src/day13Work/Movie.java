package day13Work;

import java.util.Scanner;

public class Movie implements Comparable<Movie> {
	private int id;
	private String name;
	private float duration;
	
	Scanner scanner;
	
	//default
	public Movie(){
		scanner = new Scanner(System.in);
	}
	//overloaded constructors
	public Movie(String name,float duration){
		scanner = new Scanner(System.in);
		this.name = name;
		this.duration = duration;
	}
	
	public Movie(int id,String name, float duration)
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
	public synchronized void getMovieDetailsFromUser() {
		System.out.println("Please enter the movie id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the movie name");
		name = scanner.nextLine();
		System.out.println("Please enter the movie duration");
		duration = scanner.nextFloat();
	}
	/*void printMovieDetails() {
		System.out.println("Movie ID "+id+"\nMovie Name "+name+"\nMovie Duration "+duration);
		System.out.println("------------------------------------");
	}*/
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Movie ID "+id+"\nMovie Name "+name+"\nMovie Duration "+duration;
	}
	
	@Override
	public boolean equals(Object obj) {
		Movie m2 = (Movie)obj;
		Movie m1 = this;
		if(m1.getName().equals(m2.getName()) && m1.getDuration()==m2.getDuration())
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Movie o) {
		/*if(this.getId()==o.getId())
			return 0;
		else if(this.getId()> o.getId())
			return 1;
		else
			return -1;*/
		return this.getName().compareTo(o.getName());
	}
}
