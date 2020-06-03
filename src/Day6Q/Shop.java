package Day6Q;

public class Shop {
	
	void addCustomer() {
		SilverCustomer customer = new SilverCustomer();
		customer.getCustomerDataFromUser();
		customer.luckyDraw(101);
		
	}

	public static void main(String[] args) {
		new Shop().addCustomer();
		System.out.println("Hello this is new");
	}

}
