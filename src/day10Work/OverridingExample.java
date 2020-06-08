package day10Work;

public class OverridingExample {

	int num1;
	String str1;
	
	public OverridingExample() {
		num1 = 100;
		str1 = "Something";
	}
	@Override
	public String toString() {
		
		return str1+" : "+num1;
	}
	public static void main(String[] args) {
		
		OverridingExample ore = new OverridingExample();
		System.out.println(ore.toString());
	}

}
