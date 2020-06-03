
public class TypeChangeExample {

	void changType() {
		int iNum1 = 10;
		float fNum2 = 20.34f;
		double dNum3 = 34.22;
		//int result = (int)fNum2;//explicit casting
		float result = (float)dNum3;//explicit casting
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		new TypeChangeExample().changType();

	}

}
