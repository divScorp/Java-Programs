package ClassAndObjects;

public class Radio {
	int volume;
	String station;
	boolean powerStatus;

	public void increaseVolume() {
		volume+=2;
	}

	public void decreaseVolume(){
		volume--;
	}

	public void changeStation(String newStation) {
		station = newStation;
	}

	public void turnOn() {
		volume = 3;
		powerStatus = true;
	}

	public void turnOff() {
		volume = 0;
		station="Nil";
		powerStatus = false;
	}
	void status(){
		if(powerStatus)
			System.out.println("Radio is On! ");
		else
			System.out.println("Radio is off! ");
		System.out.println("Station Name: "+station);
		System.out.println("Volume: "+volume);
		
	}
	public static void main(String[] args) {
		Radio r1=new Radio();
		r1.changeStation("Radio Mirchi! ");
		r1.turnOn();
		r1.status();
		System.out.println("----------------------------------");
		r1.increaseVolume();
		r1.status();
		System.out.println("----------------------------------");
		r1.decreaseVolume();
		r1.turnOff();
		r1.status();
		System.out.println("----------------------------------");
		
	}
}