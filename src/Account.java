
public class Account {

	private String accountNumber, name;//instance members
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Account(){
		this.accountNumber = "";
		this.name = "";
		System.out.println("Account created");
	}
	//parameters
	Account(String accountNumber,String name){
		this.accountNumber = accountNumber;//instance member = parameter
		this.name = name;//this is a ref to the current object
		System.out.println("Account created and number generated");
	}
	void printAccountDetails() {
		System.out.println("Account number "+accountNumber+" name "+name);
	}
	void takeAccountDetails() {
		
	}
}
