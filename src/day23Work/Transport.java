package day23Work;

import java.util.*;

public class Transport {

	ArrayList<Driver> drivers;
	HashMap<String, Bus> buses;
	ArrayList<Employee> employees;
	Scanner scanner ;
	
	Transport(){
		scanner = new Scanner(System.in);
		drivers = new ArrayList<Driver>();
		buses = new HashMap<String,Bus>();
		employees = new ArrayList<Employee>();
	}
	
	void addDrivers() {
		String choice = "No";
		Driver driver;
		do {
			driver = new Driver();
			driver.getDriverDetailsFromUser();
			drivers.add(driver);
			System.out.println("Do you wish to add another driver??");
			choice = scanner.nextLine();
			
		} while (choice.toUpperCase().equals("YES"));
		
	}
	void addBus() {
		String choice = "No";
		Bus bus;
		do {
			bus = new Bus();
			bus.getBUsDetailsFromUser();
			assignDriver(bus);
			buses.put(bus.getBusNumber(), bus);
			System.out.println("Do you wish to add another Bus??");
			choice = scanner.nextLine();
			
		} while (choice.toUpperCase().equals("YES"));
		
	}
	void addEmployees() {
		String choice = "No";
		Employee employee;
		do {
			employee = new Employee();
			employee.getEmployeeDetailsFromUser();
			employees.add(employee);
			System.out.println("Do you wish to add another Employee??");
			choice = scanner.nextLine();
			
		} while (choice.toUpperCase().equals("YES"));
	}
	private Driver findDriver(int driverId) {
		Driver driver = null;
		for (int i = 0; i < drivers.size(); i++) {
			if(driverId == drivers.get(i).getId())
			{
				driver = drivers.get(i);
				break;
			}
		}
		return driver;
	}
	
	private void assignDriver(Bus bus) {
		System.out.println("The Drivers availble are. ");
		for (Driver driver : drivers) {
			if(driver.isBusAllocated()==false)
				System.out.println(driver);
		}
		System.out.println("Please select the id ");
		int selectedDriverId = scanner.nextInt();
		scanner.nextLine();
		try {
			findDriver(selectedDriverId).setBusAllocated(true);
			bus.setDriver(findDriver(selectedDriverId));
			
		} catch (NullPointerException e) {
			System.out.println("Invalid Driver Id.");
		}
	
	}

	void printDrivers() {
		for (Driver driver : drivers) {
			System.out.println(driver);
		}
	}
	
	void printBuses() {
		Object[] busNumbers =  buses.keySet().toArray();
		for (int i = 0; i < buses.size(); i++) {
			System.out.println(buses.get(busNumbers[i]));
		}
	}
	
	void printEmployees() {
		TreeSet<Employee> sortedEmployees = new TreeSet<Employee>();
		sortedEmployees.addAll(employees);
		for (Employee employee:sortedEmployees) {
			System.out.println(employee);
		}
	}
	void selectBusForEmployee() {
		for (int i = 0; i < employees.size(); i++) {
			System.out.println("Please select a bus-");
			printBuses();
			String selectedBusId = scanner.nextLine();
			if(buses.containsKey(selectedBusId))
			{
				Bus bus = buses.get(selectedBusId);
				if(bus.getCapacity()>bus.getFilledStatus())
					employees.get(i).assignBus(bus);
				else
					System.out.println("The selected bus is already full");
			}
			else
			{
				System.out.println("No such bus. Bus not assigned");
			}
			
		}
	}
	void printMenu() {
		addDrivers();
		addBus();
		addEmployees();
		selectBusForEmployee();
		printEmployees();
	}
	public static void main(String[] args) {
		Transport transport = new Transport();
		transport.printMenu();

	}

}
