import java.util.Scanner;
public class SumOfTenNumbers {

	int[] numbers;
	Scanner scanner;
	
	public SumOfTenNumbers() {
		scanner = new Scanner(System.in);
		numbers = new int[10];
	}
	public SumOfTenNumbers(int size) {
		scanner = new Scanner(System.in);
		numbers = new int[size];
	}
	
	void getNumbersFromUserAndSum() {
		int num = 0,sum =0;
		for (int i = 0; i < 3; i++) {
			System.out.println("User user enter the number");
			num = scanner.nextInt();
			sum = sum +num;
		}
		System.out.println("User user the sum is "+sum);
		
	}
	void getNumbersFromUser() {
		for (int i = 0; i < 10; i++) {
			System.out.println("User user enter the number");
			numbers[i] = scanner.nextInt();
		}		
	}
	boolean checkIfDivisibleBySeven(int num) {
		boolean result = false;
		if(num%7 ==0 )
			result = true;
		
		return result;
	}
	void printCheckedResult() {
		for (int i = 0; i < 10; i++) {
			System.out.print(numbers[i]+" - ");
			if(checkIfDivisibleBySeven(numbers[i])==true)
				System.out.println("Divisible");
			else
				System.out.println("Not Divisible");
		}
	}
	public static void main(String[] args) {
		SumOfTenNumbers sotn = new SumOfTenNumbers();
		sotn.getNumbersFromUser();
		sotn.printCheckedResult() ;

	}

}
