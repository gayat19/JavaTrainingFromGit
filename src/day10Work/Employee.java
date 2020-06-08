package day10Work;

public class Employee {

	private int id,age;
	private String name;
	
	Employee(){
		id = 101;
		name = "No name";
		age = 0;
	}
	Employee(int id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		String data = "Id : "+id+
				"\nName : "+name+
				"\nAge : "+age;
		return data;
	}
	
	@Override
	public boolean equals(Object obj) {
		/*if(this.toString().equals(obj.toString()))
			return true;
		else
			return false;*/
		Employee other = (Employee)obj;//Type cast
		if(this.id == other.id)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Employee employee1 = new Employee(102,"Somu",23);
		Employee employee2= new Employee(102,"Somu",22);
		System.out.println(employee1);
		System.out.println(employee2);
			
		if(employee1.equals(employee2))
			System.out.println("Both have same details");
		else
			System.out.println("Both have different data");
	}

}
