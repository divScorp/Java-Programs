package interfaceExamples;


public class InterfaceWithMain {
	public static void main(String[] args) {
		Bird bird = new Bird();
		bird.fly();// Bird is flying

		Aeroplane aeroplane = new Aeroplane();
		aeroplane.fly();// Aeroplane is flying

		// An interface reference variable can hold
		// objects of any implementation of interface
		Flyable flyable1 = new Bird();
		Flyable flyable2 = new Aeroplane();
		flyable1.fly();
		flyable2.fly();

	}
}
