package interfaceExamples;

interface Aaa {
	int methodA();
}

interface Bbb {
	int methodB();
}

interface Ccc {
	int methodC();
}
interface Ddd{
	
}

class D implements Aaa, Bbb, Ccc, Ddd {
	int i = 999 + 111;
	public int methodA() {
		i = +i / i;
		return i;
	}

	public int methodB() {
		i = -i * i;
		return i;
	}

	public int methodC() {
		i = ++i - --i;
		return i;
	}
}

public class practice4 {
	public static void main(String[] args) {
		D d = new D();
		System.out.println(d.i);
		System.out.println(d.methodA());
		System.out.println(d.methodB());
		System.out.println(d.methodC());
	}
}
