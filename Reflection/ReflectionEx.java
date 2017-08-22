package Reflection;

//import java.lang.reflect.Method;
//import java.lang.reflect.Field;
//import java.lang.reflect.Constructor;

class Test {
	private String s;

	public Test() {
		s = "Hey! I'm Initialized";
	}
	public Test(String s) {
		this.s=s;
	}
	public void method1() {
		System.out.println("The string is " + s);
	}

	public void method2(int n) {
		System.out.println("The number is " + n);
	}

//	private void method3() {
//		System.out.println("Private method invoked");
//	}
}

public class ReflectionEx {

	public static void main(String[] args) {
		Test obj=new Test();
        System.out.println("The public methods of class are : "+obj);
	}
}
