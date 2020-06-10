package day12Work;

interface flying{
	void takeOff();
	void fly();
	void land();
	public default void anotherFlying() {
		System.out.println("This is a instance method in the interface flying");
	}
	public static void flyingMethod() {
		System.out.println("This is in the flying interface--satatic method");
	}
}

interface living {
	void eat();
	void sleep();
	void beathe();
	public default void anotherFlying() {
		System.out.println("This is a instance method in the interface flying");
	}
}
//final method and class example final class cannot be inherited
final class SummaClass{
	//final methods cannot be overridden
	public final void  kapsaMethod() {
		
	}
}

abstract class Animal{
	protected final void live() {
		System.out.println("They live in world");
	}
	abstract void look();
}


class Bird extends Animal implements flying,living{

	@Override
	public void eat() {
		System.out.println("Birds eat worms and fruits");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("Birds sleep on trees");
		
	}

	@Override
	public void beathe() {
		System.out.println("Inhale and exale... repeat");
		
	}

	@Override
	public void takeOff() {
		System.out.println("flap wings fast");
		
	}

	@Override
	public void fly() {
		System.out.println("Maintain height");
		
	}

	@Override
	public void land() {
		System.out.println("Stop flapping wing");
		
	}

	@Override
	public void anotherFlying() {
		// TODO Auto-generated method stub
		flying.super.anotherFlying();
		living.super.anotherFlying();
	}

	@Override
	void look() {
		System.out.println("Light weight and has wings");
		
	}
	
}



public class World {

	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.look();
		flying flyingObject;
		flying.flyingMethod();
		flyingObject = bird;
		flyingObject.anotherFlying();
		flyingObject.takeOff();
		flyingObject.fly();
		flyingObject.land();
		System.out.println("-----------------");
		living livingObject = bird;
		livingObject.anotherFlying();
		livingObject.eat();
		livingObject.beathe();
		livingObject.sleep();
		

	}

}
