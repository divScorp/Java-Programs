package MethodOverloading;

public class TestMethod2 {

	static void add(int a, double d){
		System.out.println("Argument type (int , double)");
	}
	
	static void add(double d, int a){
		System.out.println("Argument type (double, int)");
	}
	
	static void add(double d, double a){
		System.out.println("Argument type (double, double)");
	}
	static void add(int a, float f){
		System.out.println("Argument type (int , float)");
	}
	static void add(float f, int a){
		System.out.println("Argument type (float, int)");
	}
	
	public static void main(String... args){
		
		//add(10,20); is a ambiguous CTE;
		// because he can't able to decide which argument he will take as double or int 
		// as there exists two methods with args (int, double) and (double, int)
		//add(12,13);
		add(10,20.0);
		add(10.0f,10);
	}
}
