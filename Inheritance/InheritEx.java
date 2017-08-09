package Inheritance;

class SuperClass {
	int i, j;

	void showij() {
		System.out.println("i and j: " + i + " " + j);
	}
}

class SubClass extends SuperClass {
	int k;

	void showk() {
		System.out.println("k:" + k);
	}

	void sum() {
		System.out.println(i + j + k);
	}

}

class InheritEx {
	public static void main(String args[]) {
		SuperClass sup = new SuperClass();
		SubClass sub = new SubClass();

		sup.i = 10;
		sup.j = 20;
		System.out.println("Contents of super class ");
		sup.showij();
		sub.i = 7;
		sub.j = 8;
		sub.k = 9;
		System.out.println("Contents of sub class");
		sub.showij();
		sub.showk();
		System.out.println("Sum of i, j and k in sub class");
		sub.sum();
	}
}
