package Constructor;

public class ConstEx1 {

	// if we won't provide any constructor compiler adds default constructor
	// int this case, ConstEx1(){} , but if we provide any other constructor
	// compiler won't add.

	int x, y;

	// no-argument constructor
	ConstEx1() {
		getX(); // we can call both static and non-static method from
				// constructor
		x = 0;
		y = 0;
	}

	// Parameterized Constructor
	ConstEx1(int l) {

		x = y = l;
		getX();
	}

	ConstEx1(int l, int m) {
		x = l;
		y = m;
	}

	static void getX() {
		System.out.println(" You're inside method getX() ");
		// return x;
	}

	public static void main(String[] args) {
		ConstEx1 c1 = new ConstEx1();
		System.out.println("[C1]X= " + c1.x + " Y= " + c1.y);

		ConstEx1 c2 = new ConstEx1(20);
		ConstEx1 c3 = new ConstEx1(12, 13);

		System.out.println("[C2]X= " + c2.x + " Y= " + c2.y);
		System.out.println("[C3]X= " + c3.x + " Y= " + c3.y);
	}
}
