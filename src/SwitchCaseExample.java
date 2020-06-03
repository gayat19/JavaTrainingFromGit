import java.util.Scanner;
public class SwitchCaseExample {

	Scanner sc;
	String userDay;
	SwitchCaseExample(){
		sc = new Scanner(System.in);
		userDay = null;
	}
	
	void getDayFromUser() {
		System.out.println("Please enter the day");
		userDay = sc.nextLine();
	}
	
	void checkAndPrintDayType() {
		switch (userDay) {
		case "Monday":
			
		case "Tuesday":
			
		case "Wednesday":
			
		case "Thursday":

		case "Friday":
			System.out.println("Weekday");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid day");
			break;
		}
			
	}
	public static void main(String[] args) {
		SwitchCaseExample sce = new SwitchCaseExample();
		sce.getDayFromUser();
		sce.checkAndPrintDayType();

	}

}
