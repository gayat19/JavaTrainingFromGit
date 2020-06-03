package bank;

public class Customer {

	int id,age;
	String name;
	Pan pan;
	
	public Customer(){
		id=101;
		age=23;
		name = "Ramu";
		pan = new Pan();
		pan.setPanNumber("ABCDE1233I");
		pan.fatherName = "jkshd";
	}
	
	public void printCustomerDetails() {
		System.out.println("Customer id : "+id+" name : "+name+" age : "+age);
		pan.printPanDetails();
	}
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.printCustomerDetails();
		
	}

}
