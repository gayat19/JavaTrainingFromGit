package day15Work;

public class MyAgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7257052348361479785L;
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid age for voting!!!";
	}

}
