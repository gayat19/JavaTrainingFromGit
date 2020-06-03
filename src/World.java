
public class World {

	void live() {
		Animal animal = new Animal();
		System.out.println(animal.type);
		System.out.println("---------------------");
		showLifeStlye(animal);
		animal = new Cat();
		System.out.println(animal.type);
		showLifeStlye(animal);
		//Cat cat = new Animal(); - this is wrong
	}
	void showLifeStlye(Animal a) {
		a.eat();
		a.breathe();
		a.sleep();
	}

	public static void main(String[] args) {
		World myWorld = new World();
		myWorld.live();

	}

}
