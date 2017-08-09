package ClassAndObjects;


class MonsterWorks {

	public final String TOMBSTONE = "Here Lies a Dead monster";
	private int health = 500;
	private int attack = 20;
	private int movement = 2;
	private boolean alive = true;
	public String name = "Big Monster";

	public int getAttack() {
		return attack;
	}

	public int getMovement() {
		return movement;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int decreaseHealth) {
		health = health - decreaseHealth;
		if (health < 0 && alive == true) {
			alive = false;
		}
	}

	public void setHealth(double decreaseHealth) {
		int intDecreaseHealth = (int) decreaseHealth;
		health = health - intDecreaseHealth;
		if (health < 0) {
			alive = false;
		}
	}
}
//Moster Class
public class Monster{
	
	public static void main(String[] args){
		MonsterWorks gorilla = new MonsterWorks();
		gorilla.name = "Jumbo";
		System.out.println(gorilla.name+" got health power: "+gorilla.getHealth());
		System.out.println(gorilla.name + " has an attack value of " + gorilla.getAttack());
		gorilla.setHealth(30);
		System.out.println(gorilla.name+" got attacked, Now Health "+gorilla.getHealth());
	}
}
