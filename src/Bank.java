
public class Bank {
	SavingsAccount account;
	
	Bank(){
		
	}
	
	void createAccount() {
		account = new SavingsAccount("00001","Ramu");
		account.printAccountDetails();
	}

	public static void main(String[] args) {
		Bank icici = new Bank();
		icici.createAccount();

	}

}
