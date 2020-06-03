import java.util.Scanner;

public class UserInputExample {

	int num1,num2;
	Scanner sc;
	
	UserInputExample(){
		sc = new Scanner(System.in);
	}
	
	void findAndPrintGreatest() {
		if(num1 == num2)
			System.out.println("Both are equal");
		else if(num1>num2)
			System.out.println("Num1 is greater");
		else
			System.out.println("Num2 is greater");
	}
	
	void takeTwoNumbersInput() {
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the second number");
		num2 = sc.nextInt();
	}
	public static void main(String[] args) {
		UserInputExample uie = new UserInputExample();
		uie.takeTwoNumbersInput();
		uie.findAndPrintGreatest();
	}

}
