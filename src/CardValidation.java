import java.util.Scanner;
public class CardValidation {

	String cardNumber;
	int[] intCardNumbers,reverseCardNumber;
	Scanner scanner;
	
	CardValidation(){
		intCardNumbers = new int[16];
		reverseCardNumber = new int[16];
		scanner = new Scanner(System.in);
	}
	
	void getCardNumber() {
		System.out.println("Please enter your 16 digit card number without any space");
		cardNumber =scanner.nextLine();
		if(cardNumber.length() !=16)
		{
			System.out.println("Invalid card number. Please try entering again!!!");
			getCardNumber();
		}
	}
	
	void convertStringCardNumberToIntArray() {	
		for (int i = 0; i < cardNumber.length(); i++) {
			intCardNumbers[i]= Integer.parseInt(cardNumber.substring(i,(i+1)).toString());
		}
	}
	void reverseCardNumber() {
		int j = 15;
		for (int i = 0; i < intCardNumbers.length; i++) {
			reverseCardNumber[j] = intCardNumbers[i];
			j--;
		}
	}
	boolean validateCard() {
		boolean result = false;
		int sum =0;
		for (int i = 0; i < reverseCardNumber.length; i++) {
			if(i%2 !=0)
			{
				reverseCardNumber[i] = reverseCardNumber[i]*2;
				if(reverseCardNumber[i]>9)
				{
					reverseCardNumber[i] = reverseCardNumber[i]-9;
				}
			}
			sum = sum + reverseCardNumber[i];
		}
		if(sum%10 == 0)
			result = true;
		return result;
	}
	void printCardStatus() {
		if(validateCard()==true)
			System.out.println("Valid Card");
		else
			System.out.println("Dont Cheat");
	}
	public static void main(String[] args) {
		CardValidation cardValidation = new CardValidation();
		cardValidation.getCardNumber();
		cardValidation.convertStringCardNumberToIntArray() ;
		cardValidation.reverseCardNumber();
		cardValidation.printCardStatus();
	}

}
