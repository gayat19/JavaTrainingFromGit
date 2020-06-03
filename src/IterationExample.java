
public class IterationExample {

	
	void printTenNumbers() {
		/*for(int i=0; i<10;i++)
		{
			System.out.println(i);
		}
		int i=10;
		while(i<10)
		{
			System.out.println(i);
			i++;
			//i=i+1;
		}*/
		int i=10;
		do {
			System.out.println(i);
			i++;
		}while(i<10);
		
	}
	public static void main(String[] args) {
		IterationExample ie = new IterationExample();
		ie.printTenNumbers();

	}

}
