package Inheritance;

class Box1 {
	{
		System.out.println(1);
	}
}

class Box2 extends Box1 {
	{
		System.out.println(2);
	}
}

class Box3 extends Box2 {
	{
		System.out.println(3);
	}
}

public class NblockInherit {
	public static void main(String[] args) {
		Box3 c = new Box3();
		System.out.println(c);
	}
}
