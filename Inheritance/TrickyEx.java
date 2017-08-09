package Inheritance;

class Test {
	static int i = 56;

	static {
		i = i-- - --i;
		System.out.println("i value Static Block of Test Class: "+i);
	}

	{
		i = i++ + ++i;
		System.out.println("i value Non-Static Block of Test Class: "+i);
	}
}

class Test1 extends Test {
	static {
		i = --i - i--;
		System.out.println("i value Static Block of Test1 Class: "+i);
	}

	{
		i = ++i + i++;
		System.out.println("i value Non-Static Block of Test1 Class: "+i);
	}
}

public class TrickyEx {
	public static void main(String[] args) {
//		Test1 b = new Test1();
//		System.out.println(b.i);
		System.out.println(Test.i);
	}
}
