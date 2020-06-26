package day23Work;

import java.util.*;
/*Id
Name
Phone
DateOfBirth
Age(Calculate from Date of Birth)
BusId

Methods
GetEmployeeDetailsFromUser()(Take without the bus ID)
assignBus()(List the available bus for teh employee to select)
toString()
equals*/

public class Employee implements Comparable<Employee> {

	private int id;
	private String name,phone,busId;
	private Scanner scanner;
	private Bus bus;
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

	public String getBusId() {
		return busId;
	}

	public void setBusId(String busId) {
		this.busId = busId;
	}


	
	public Employee() {}
	
	public Employee(int id, String name,String phone) {
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	public void getEmployeeDetailsFromUser() {
		scanner = new Scanner(System.in);
		System.out.println("Please enter the Employee Id");
		id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the Employee Name");
		name = scanner.nextLine();
		System.out.println("Please enter the Employee Phone");
		phone = scanner.nextLine();
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee employee1 = this;
		Employee employee2 = (Employee)obj;
		if(employee1.id == employee2.id)
			return true;
		else
			return false;
	}
	public void assignBus(Bus bus) {
		try {
			this.bus = bus;
			this.busId = bus.getBusNumber();
		} catch (NullPointerException e) {
			System.out.println("Bus not assigned");
		}
	}
	@Override
		public String toString() {
			String employeeData = "Employee Id "+id+" Name : "+name+" Phone : "+phone;
			employeeData += "/nEmployee Bus Details /n"+bus;
			return employeeData;
		}

	@Override
	public int compareTo(Employee o) {
		return this.name.compareTo(o.getName());
	}
}
