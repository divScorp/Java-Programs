package MethodOverloading;

public class TestMethod4 {
	static void add(int a, double d){
		System.out.println("Argument type (int , double)");
	}
	
	public static void add(double d, int a){
		System.out.println("Argument type (double, int)");
	}

	private static void add(double d, double a){
		System.out.println("Argument type (double, double)");
	}
	
	protected static void add(int a, float f){
		System.out.println("Argument type (int , float)");
	}
	
	public static void main(String... str){
		add(3.0,5.0);
		add(7,5.0);
		add(7,2.12f);
	}
}
