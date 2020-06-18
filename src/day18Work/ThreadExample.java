package day18Work;

import day13Work.Movie;

class MyThread extends Thread{
	@Override
	public void run() {
		
		//System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 100; i=i+10) {
			System.out.println("The value of i in "+Thread.currentThread().getName() +" is "+i);
			
		}
	}
}


class MyMovie extends Movie implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		getMovieDetailsFromUser();
		System.out.println(this);
		
	}
}

public class ThreadExample {

	
	void printTenNumbers() {
		
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i is "+i);
			
		}
	}
	
	void createMovies() {
		MyMovie movie = new MyMovie();
		Thread tmovie1 = new Thread(movie);
		Thread tmovie2 = new Thread(movie);
		tmovie1.setName("Thread 1 Movie1");
		tmovie2.setName("Thread 2 Movie2");
		tmovie1.setPriority(5);
		tmovie2.setPriority(1);
		tmovie1.start();
		tmovie2.start();
	}
	
	
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample();
		/*MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("You");
		t2.setName("Me");
		t1.start();
		t2.start();
		te.printTenNumbers();*/
		te.createMovies();
	}

}
