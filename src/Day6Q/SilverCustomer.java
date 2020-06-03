package Day6Q;

import java.util.Random;

public class SilverCustomer extends Customer {
	public void luckyDraw() {
		int num = new Random().nextInt();
		if(num==getId())
			System.out.println("you are the winner of lucky draw");
		else
			System.out.println("Better luck next time");
	}
   public void luckyDraw(int num) {
		if(num==getId())
			System.out.println("you are the winner of lucky draw");
		else
			System.out.println("Better luck next time");
	}
}
