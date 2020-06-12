package day14Work;

import java.util.*;


public class GenricExample {

	void stackSample() {
		Stack<Integer> intStack = new Stack<Integer>();
		intStack.push(100);
		intStack.push(213);
		intStack.push(2434);
		intStack.push(65);
		
		/*for (Integer num : intStack) {
			System.out.println(num);
		}*/
		System.out.println("The stack "+intStack);
		System.out.println("Pop 1 "+intStack.pop());
		System.out.println("The stack after pop 1 "+intStack);
		System.out.println("Peek 1 "+intStack.peek());
		System.out.println("The stack after peek 1 "+intStack);
		intStack.push(444);
		System.out.println("Peek 2 "+intStack.peek());
		System.out.println("The stack after peek 2 "+intStack);
	}
	
	void setSample() {
		Set<String> stringSet = new TreeSet<String>();
		stringSet.add("Hello");
		stringSet.add("Hi");
		stringSet.add("Welcome");
		stringSet.add("Done!!");
		//stringSet.add("Bye");
		stringSet.add("Hi");
		stringSet.add("Something is here");
		for (String str1 : stringSet) {
			System.out.println(str1);
		}
		
	}
	
	void listSample() {
		LinkedList<Float> floatList = new LinkedList<Float>();
		floatList.add(123.33f);
		floatList.add(290.43f);
		floatList.add(67.223f);
		floatList.add(98776.09f);
		floatList.addFirst(345.4f);
		floatList.add(2, 23.33f);
		Set<Float> floatSet = new TreeSet<Float>();
		floatSet.addAll(floatList);		
		System.out.println(floatSet);
	}
	public static void main(String[] args) {
		GenricExample ge = new GenricExample();
		ge.listSample();

	}

}
