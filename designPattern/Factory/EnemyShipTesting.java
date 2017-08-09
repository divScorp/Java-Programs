package designPattern.Factory;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String[] args) {
		// Create the factory object
		EnemyShipFactory shipFactory = new EnemyShipFactory();
		// Enemy ship object
		EnemyShip theEnemy = null;
		Scanner userInput = new Scanner(System.in);
		System.out.print("What type of ship? (U / R / B)");
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			theEnemy = shipFactory.makeEnemyShip(typeOfShip);
			if (theEnemy != null) {
				doStuffEnemy(theEnemy);
			} else
				System.out.print("Please enter U, R, or B next time");
		}
		userInput.close();
	}

	public static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();

	}

}