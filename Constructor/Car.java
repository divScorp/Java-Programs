package Constructor;

class CarCreat {

	int regNum;
	private static int num=1000;
	
	CarCreat(){regNum=num++;}
	
	void cardetails(){
		System.out.println("Your car: "+regNum);
	}
	
	void start(){
		System.out.println("Car Starts. ");
	}
	void accelerate(){
		System.out.println("Car Accelerate. ");
	}
	void stop(){
		System.out.println("Car Stops. ");
	}
}

class Driver{
	String name;
	CarCreat c=new CarCreat();
	Driver(String n){
		name=n;		
	}
	void driverName(){
		System.out.println(name);
	}
}

public class Car{
	public static void main(String... args){
		
		Driver dr=new Driver("xyz");
		dr.driverName();
		dr.c.cardetails();
		dr.c.start();

		Driver dr1=new Driver("abc");
		dr.driverName();
		dr1.c.cardetails();
		dr1.c.start();
	}
}