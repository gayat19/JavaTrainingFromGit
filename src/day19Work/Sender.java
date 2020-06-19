package day19Work;

import java.util.concurrent.ThreadLocalRandom;

public class Sender implements Runnable {
	private Data data;
	public Sender(Data data) {
		this.data = data;
	}
	@Override
	public void run() {
		String messages[] = {"Message 1","Second Message","3rd Message","4444","Over"};
		for (String msg : messages) {
			data.send(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interruped");
			}
		}
		
	}
	

}
