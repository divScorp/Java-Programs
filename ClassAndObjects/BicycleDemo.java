package ClassAndObjects;

class Bicycle{
	int speed=0;
	int gear=1;
	void changeGear(int newValue){
		gear=newValue;		
	}
	void speedUp(int inc){
		speed=speed+inc;
	}
	void applybreak(int dec){
		speed=speed-dec;
	}
	void printstate(){
		System.out.println("Speed : "+speed+"\t Gear : "+gear);
	}
}

public class BicycleDemo {

	public static void main(String[] args){
		Bicycle b1=new Bicycle();
		Bicycle b2=new Bicycle();
		
		b1.speedUp(50);
		b1.changeGear(3);
		b1.applybreak(20);
		b1.printstate();
		
		b2.speedUp(60);
		b2.changeGear(2);
		b2.printstate();
	}
}
