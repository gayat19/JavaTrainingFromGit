package day13Work;

import java.util.*;

public class GenricExample{

	ArrayList<Double> myArray;
	
	GenricExample(){
		myArray = new ArrayList<Double>();
	}
	
	void addMembers() {
		myArray.add((double)10);
		myArray.add((double)10.2f);
		//myArray.add("Hello");//not possible to add
		myArray.add(1288.22);
		//myArray.add(new Movie(101,"GGG",12.2f));//not possible to add
		//myArray.add(true);//not possible to add
		//myArray.add('w');//not possible to add
	}
	
	void printCollection() {
		/*for (int i = 0; i < myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}*/
		for (Double myNum : myArray) {
			System.out.println(myNum);
		}
	}
	
	void sumCollection() {
		double sum =0;
		/*for (int i = 0; i < myArray.size(); i++) {
			sum = sum + Double.parseDouble(myArray.get(i).toString());
			System.out.println("The sum till now is "+sum);
		}*/
		for (Double myNum : myArray)  {
			sum = sum + Double.parseDouble(myNum.toString());
			System.out.println("The sum till now is "+sum);
		}
		System.out.println("The final sum is "+sum);
	}
	public static void main(String[] args) {
		GenricExample ge = new GenricExample();
		ge.addMembers();
		ge.printCollection();
		ge.sumCollection();

	}

}
