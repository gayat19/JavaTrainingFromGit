package day23Work;

import java.util.Scanner;
/*Create a Bus Model Class with the following members
BusNumber(ex-Tn23AC1234)
Capacity
FilledStatus
Source
Driver(Object of driver class)

GetBusDetailsFromUser()(While taking driver details, list the available drivers and select using the id)
toString()
equals()*/

public class Bus {

	private String busNumber,Source;
	private int capacity,filledStatus;
	private Driver driver;
	private Scanner scanner;
	
	public String getBusNumber() {
		return busNumber;
	}
	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getFilledStatus() {
		return filledStatus;
	}
	public void setFilledStatus(int filledStatus) {
		this.filledStatus = filledStatus;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Bus() {
		
	}
	public Bus(String busNumber,String source,int capacity,int filledStatus,Driver driver) {
		this.busNumber = busNumber;
		this.Source = source;
		this.capacity = capacity;
		this.filledStatus = filledStatus;
		this.driver = driver;
	}
	public void getBUsDetailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter the bus number");
		busNumber = scanner.nextLine();
		System.out.println("Please enter the bus Source Place");
		Source = scanner.nextLine();
		System.out.println("Please enter the bus capacity");
		capacity = scanner.nextInt();
		System.out.println("Please enter the bus current filled status");
		filledStatus = scanner.nextInt();
		
	}
	@Override
	public boolean equals(Object obj) {
		Bus bus1 = this;
		Bus bus2 = (Bus)obj;
		if(bus1.busNumber.equals(bus2.busNumber))
			return true;
		else
			return false;
	}
	@Override
	public String toString() {
		String busData = "Bus number : "+busNumber+ " From Location : "+Source+ " with Capacity : "+capacity+" is occupied with : "+filledStatus;
		busData += "/n Driver Details : "+driver;
		return busData;
	}
}
