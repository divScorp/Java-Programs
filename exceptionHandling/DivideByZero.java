package exceptionHandling;

public class DivideByZero {

	public static int divide(int a,int b) {
		return a/b;
	}
	public static int computeDivison(int a, int b) {
		return divide(a,b);
	}
	public static void main(String[] args) {
		int a=1, b=0;
		try {
			int i=computeDivison(a, b);
			System.out.println("Divide Result: "+i);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
