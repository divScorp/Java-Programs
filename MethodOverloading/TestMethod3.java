package MethodOverloading;

public class TestMethod3 {

	static void add(double d, double a){
		System.out.println("Addition: "+(a+d));
	}
	static void add(int d, double a){
		System.out.println("Addition: "+(a+d));
	}
//	static void add(double d, int a){
//		System.out.println("Addition: "+(a+d));
//	}
//	
	public static void main(String... str){
		add(3,5);
	}
}
