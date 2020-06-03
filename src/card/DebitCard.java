package card;

import bank.*;

public class DebitCard {

	Customer customer;
	DebitCard(){
		bank.Example ex = new bank.Example();
		customer = new Customer();
		//pan.setPanNumber("AGTHK8765O");
		customer.printCustomerDetails();
		
	}
	public static void main(String[] args) {
		

	}

}
