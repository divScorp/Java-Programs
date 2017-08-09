package Constructor;

public class CopyConst {

	double real, imaginary;

	public CopyConst(double re, double img) {
		real = re;
		imaginary = img;
	}

	// Copy Constructor
	public CopyConst(CopyConst c) {

		real = c.real;
		imaginary = c.imaginary;
	}

	@Override // toString() is the override method of Object Class
	public String toString() {
		return "(" + real + " + " + imaginary + "i)";
	}

	public static void main(String[] args) {

		CopyConst c1 = new CopyConst(10, 15);
		CopyConst c2 = new CopyConst(c1);
		CopyConst c3 = c1;

		System.out.println("[C2]" + c2); // if we directly print object Output
											// Constructor.CopyConst@6d06d69c

		System.out.println("[C3]" + c3); // on directly printing object it will
											// call toString() of Object class
	}

}
