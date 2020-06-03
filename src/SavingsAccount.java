
public class SavingsAccount extends Account {

	SavingsAccount(){
		System.out.println("Savings type");
	}
	SavingsAccount(String accountNumber,String name){
		setAccountNumber(accountNumber);
		setName(name);
		System.out.println("Savings Account created and number generated");
	}
}
