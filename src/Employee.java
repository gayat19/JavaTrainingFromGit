
public class Employee {

	int id,age;
	String name;
	
	Employee(){
		
	}
	Employee(int eid,String ename,int eage){
		id=eid;
		name=ename;
		age = eage;
	}
	boolean employeeAgeCheck() {
		boolean result = false;
		if(age>=18)
		{
			System.out.println("You can join");
			result = true;
		}
		else
			System.out.println("You are under age for employment");
		return result;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee();
		boolean checkResult = e1.employeeAgeCheck();
		if(checkResult == true)
			e1.printEmployeeData();
		
		/*if( e1.employeeAgeCheck() == true)
			e1.printEmployeeData();*/
	}
	void work()
	{
		System.out.println("Employee does his work");
	}
	void printEmployeeData() {
		System.out.println("Employee Id : "+id);
		System.out.println("Employee Name : "+name);
		System.out.println("Employee Age : "+age);
		System.out.println("-----------");
	}
	//compile	
	

}
