import java.util.Scanner;
public class DataInOneLine  {

	int[] numbers;
	Scanner scanner;
	
	public DataInOneLine() {
		scanner = new Scanner(System.in);
		numbers = new int[10];
	}
	public DataInOneLine (int size) {
		scanner = new Scanner(System.in);
		numbers = new int[size];
	}
	
	void getNumbersFromUser() {
		String strNumber = null;
		System.out.println("User user enter the numbers seperated by ,");	
		strNumber = scanner.nextLine();
		splitDataToNumbers(strNumber);
	}
	void splitDataToNumbers(String number) {
		String[] strNumbers = number.split(",");
		for (int i = 0; i < strNumbers.length; i++) {
			numbers[i] = Integer.parseInt(strNumbers[i]);
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
		DataInOneLine datainOneLine = new DataInOneLine();
		datainOneLine.getNumbersFromUser();
		datainOneLine.printCheckedResult() ;

	}

}
