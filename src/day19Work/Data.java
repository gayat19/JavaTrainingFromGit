package day19Work;

public class Data {
  private String message;
  private boolean transfer = true;
  
  public synchronized void send(String message) {
	  while(!transfer) {
		  try {
			wait();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread Interruped");
		}
	  }
	  transfer =false;
	  this.message = message;
	  notifyAll();
  }
  public synchronized String receive() {
	  while(transfer) {
		  try {
			wait();
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			System.out.println("Thread Interruped");
		}
	  }
	  transfer = true;
	  notifyAll();
	  return this.message;
  }
}
