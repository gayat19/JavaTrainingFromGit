
public class Cycle {
	float speed;
	Cycle(){
		System.out.println("This is a cycle");
		speed = 10.0f;
	}
	void ringBell() {
		System.out.println("Tring tring");
	}
	void run(){
		System.out.println("Runs in "+speed+" Speed");
	}
}
