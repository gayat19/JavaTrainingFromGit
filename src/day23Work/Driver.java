package day23Work;

import java.util.Scanner;

/*Create a Driver Class
DriverID
DriverName
DriverPhone
BusAllocated-Boolean

Methods
GetDriverDetailsFromUser()
toString()
equals()*/
public class Driver {

	private int id;
	private String name,phone;
	private boolean busAllocated;
	private Scanner scanner;

	public Driver() {
		//scanner = new Scanner(System.in);
		
	}
	public Driver(int id,String name,String phone,boolean busAllocated) {
		
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.busAllocated = busAllocated;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isBusAllocated() {
		return busAllocated;
	}
	public void setBusAllocated(boolean busAllocated) {
		this.busAllocated = busAllocated;
	}
	
	public void getDriverDetailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter the driver id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the driver name");
		name = scanner.nextLine();
		System.out.println("Please enter the driver phone");
		phone = scanner.nextLine();
	}
	
	@Override
	public String toString() {
		String data = "Driver Id : "+id+" Name : "+name+" Phone : "+phone+" Bus Allocated : "+busAllocated;
		return data;
	}
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		Driver driver1 =this;
		try {
			Driver driver2 = (Driver)obj;
			if(driver1.id == driver2.id)
				result = true;
		} 

		catch (Exception e) {
			result = false;
		}
		return result;
		
	}
}
