package Inheritance;

class Box11 {
	static {
		System.out.println(1);
	}
}

class Box12 extends Box11 {
	static {
		System.out.println(2);
	}
}

class Box13 extends Box12 {
	static {
		System.out.println(3);
	}
}

public class SblockInherit {
	public static void main(String[] args) {
		Box13 c = new Box13();
		System.out.println(c);
	}
}
