package designPattern.Decorator;

public abstract class DecorateIcecream implements Icecream {
	Icecream icecream;
}

class Chocolate extends DecorateIcecream{
	public Chocolate(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String description() {
		return "Chocolate";
	}

	@Override
	public Double cost() {
		return this.icecream.cost() + 5.0;
	}
}

class Peanuts extends DecorateIcecream{
	public Peanuts(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String description() {
		return "Peanuts";
	}

	@Override
	public Double cost() {
		return this.icecream.cost() + 3.0;
	}
}