
public class Road {
     
	void addTraffic() {
		Cycle bsa = new Cycle();
		bsa.ringBell();
		bsa.run();
		System.out.println("--------------------------");
		MotorCycle tvs = new MotorCycle();
		tvs.soundHorn();
		tvs.run();
	}

	
	public static void main(String[] args) {
		Road road = new Road();
		road.addTraffic();

	}

}
