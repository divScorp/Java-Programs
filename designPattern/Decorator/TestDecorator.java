package designPattern.Decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Icecream vanilla = new Vanilla();
		System.out.println("Simple vanilla cost: " + vanilla.cost());
		
		Icecream vanillaWithPeanuts = new Peanuts(vanilla);
		System.out.println("Vanilla with peanuts cost: " + vanillaWithPeanuts.cost());
		
		Icecream vanillaWithChocolate = new Chocolate(vanilla);
		System.out.println("Vanilla with chocolate cost: " + vanillaWithChocolate.cost());

	}

}
