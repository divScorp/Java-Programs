package abstractKey;

/* If a class is not having any abstract method
 * then it is possible to have no abstract method
 * 
 *  But if a class have one or more abstract method
 *  then class should be abstract.
 * */
abstract class Car{
	abstract void start();// Abstract method must be implemented 
						// in subclasses
}
class Audi extends Car{
	@Override
	 void start(){
			System.out.println("Audi Car ");
		}
}
class BMW extends Car{
	@Override
	 void start(){
			System.out.println("BMW Car");
		}
}
class Drive{
	void drive(Car c) {
		c.start();
	}
}

public class Example1 {

	public static void main(String[] args) {
		Drive d=new Drive();
		d.drive(new Audi());
		d.drive(new BMW());
	}

}
