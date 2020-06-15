package day15Work;

import java.util.*;
import java.io.*;

public class ExceptionExamaple {
	
	HashMap<Integer,String> myMap;
	
	public ExceptionExamaple() {
		 myMap = new HashMap<Integer,String>();
	}
	
	void addDataToMap() {
		try {
			myMap.put(101,"Ramu");
			myMap.put(102,"Somu");
			myMap.put(103,"Bimu");
			myMap.put(103,"Lomu");
			String data = myMap.get(101).toLowerCase();
			int result =100/(100-100);
			System.out.println("Map filled");
		} 
		catch (NullPointerException e) {
			System.out.println("Map not initialized. Please restart the program");
		}
		catch (Exception e) {
			System.out.println("Some error in the code.....");
		}
		finally {
			System.out.println("Whatever happens.....");
		}
		System.out.println("Map add complete");
	}
	
	void printMap() {
		System.out.println(myMap.get(101).charAt(2));
		System.out.println("Map print complete");
		
	}
	
	
	void fileRead() {
		File file = new File("E:\\sony lap backup\\d drive\\Corp\\SpineBiz\\Day5-Q.txt");
		Scanner scanner;
		try {
			scanner = new Scanner(file);
			while(scanner.hasNextLine())
				System.out.println(scanner.nextLine());
			
		} catch (FileNotFoundException e) {
			System.out.println("File not available");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	void checkVoteEligibility() {
		int age = 12;
		try {
			 if(age<18)
				throw new MyAgeException();
			System.out.println("You can vote...");
			} catch (MyAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}
	
	public static void main(String[] args) {
		
		ExceptionExamaple ee = new ExceptionExamaple();
		/*ee.addDataToMap();
		ee.printMap();
		ee.fileRead();*/
		ee.checkVoteEligibility();
	}

}
