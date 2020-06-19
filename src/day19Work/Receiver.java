package day19Work;

import java.util.concurrent.ThreadLocalRandom;

public class Receiver implements Runnable {
	private Data myData;
	
	public Receiver(Data data) {
		myData = data;
	}
	
	@Override
	public void run() {
		for(String msg = myData.receive();!msg.equals("Over");msg = myData.receive()) {
			System.out.println(msg);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				System.out.println("Thread Interruped");
			}
		}
		
	}

}
