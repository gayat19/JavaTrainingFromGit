import java.util.Scanner;

public class PrimeInRange {
	int minNumber,maxNumber;
	Scanner scanner;
	
	PrimeInRange() {
		minNumber = maxNumber = 0;
		scanner = new Scanner(System.in);
	}
	
	void getNumbersFromUser() {
		System.out.println("User user enter the min number");
		minNumber = scanner.nextInt();
		System.out.println("User user enter the max number");
		maxNumber = scanner.nextInt();
		if(minNumber>=maxNumber)
		{
			System.out.println("Incorrect entries... Please try again...");
			getNumbersFromUser();
		}
	}
	boolean CheckIfPrimeOrNot(int num) {
		boolean result = true;
		
		for (int i = 2; i < num-1; i++) {
			if(num%i == 0)
			{
				result = false;
				break;
			}
		}
		return result;
	}
	
	void checkRangeForPrime() {
		getNumbersFromUser();
		for (int i = minNumber; i <= maxNumber; i++) {
			System.out.print(i+" - ");
			if(CheckIfPrimeOrNot(i)==true)
				System.out.println("Prime");
			else
				System.out.println("Not Prime");
		}
	}
	public static void main(String[] args) {
		PrimeInRange primeInRange = new PrimeInRange();
		primeInRange.checkRangeForPrime() ;
	}

}
