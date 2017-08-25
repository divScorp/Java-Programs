package designPattern.Decorator;

public interface Icecream {
	public String description();

	public Double cost();
}

class Vanilla implements Icecream {

	@Override
	public String description() {
		return "Vanila Icecream!";
	}

	@Override
	public Double cost() {
		return 15.0;
	}
}

class Strawberry implements Icecream {

	@Override
	public String description() {
		return "Strawberry Icecream!";
	}

	@Override
	public Double cost() {
		return 20.0;
	}
}
