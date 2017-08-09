package Inheritance;

class A {
	private int i = 12;
	protected int j = 13;
	public int k = 14;
	int m = 3;

	A() {
		System.out.println("I'm Constructor from class A.");
	}

	private void m1() {
		System.out.println("Private method of class A " + i);
	}

	protected void m2() {
		System.out.println("Protected method of class A " + j);
		m1();
	}

	public void m3() {
		System.out.println("Public method of class A " + k);
	}

	void m4() {
		System.out.println("Package method of class A" + i + " " + m);
	}
}

class B extends A {

	B() {
		System.out.println("I'm Constructor from class B.");
	}

	public void m5() {
		// System.out.println(i); // private variables not accessible in
		// sub-class
		System.out.println(" Method from class B. ");
		System.out.println("Protected j= " + j);
		System.out.println("public k= " + k);
		System.out.println("Package m= " + m);
		// m1(); // Private method is not accessible in sub-class
		m2();
		m3();
		m4();
	}

}

public class SingleLevel {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("----------------------------------");
		System.out.println(" From Main method. ");
		b.m5();
		b.m4();
		System.out.println("----------------------------------");
	}

}
