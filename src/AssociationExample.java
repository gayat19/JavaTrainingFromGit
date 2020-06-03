import java.util.Scanner;

class Customer{
	int id;
	String name;
	Scanner scanner;
	Customer(){
		scanner = new Scanner(System.in);
		id = 101;
		name = "No one";
	}
	Customer(int cid,String cname){
		id = cid;
		name = cname;
	}
	void getCustomerData() {
		System.out.println("Please enter the customer id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the customer name");
		name = scanner.nextLine();
	}
	void printCustomerData() {
		System.out.println("Customer id "+id+" Name "+name);
	}
}



public class AssociationExample {

	Customer customer;
	public AssociationExample() {
		customer = new Customer();
		customer.getCustomerData();
	}
	
	void printCustomerDetails() {
		customer.printCustomerData();
	}
	public static void main(String[] args) {
		AssociationExample ae = new AssociationExample();
		ae.printCustomerDetails();

	}

}
