package MethodOverloading;

public class TestMethod1 {

	//Yes we can overload static method
	static void add(int a){
		System.out.println("Static Method with (int)");
	}
	static void add(int a, String s){
		System.out.println("Static Method with (int, String)");
	}
	
	//Yes we can overload method with different No. of arguments.
	void add(int a, int b){		
		System.out.println("Method with (int, int)");
	}
	void add(int a, int b, int c){
		System.out.println("Method with (int, int, int)");
	}
	
	//Yes we can overload method with different type of argument 
	// but the no. of argument is same.
	void add(int a, double b){
		System.out.println("Method with (int,double)");
	}
	
	//Yes we can overload method with same type and no. of arguments.
	//but the argument position is different.
	void add(double a, int b){
		System.out.println("Method with (double, int)");
	}
	
//	static void add(int a, int b){		
//		System.out.println("Method with (int, int)"); (Not possible: Compile Time Error)
//	}
	
	 void add(int ... a){		//var args (int … a) are nothing but the arrays (int[] a).
	        System.out.println("Var args method (int... a)");
	    }
	     
//	 void method(int[] a)
//	    {
//	        System.out.println(2); //Duplicate CTE; 
//	    }
	 
	 public static void main(String... agrs){
		 add(10);
		 add(10,"abc");
		 TestMethod1 t1=new TestMethod1();
		 t1.add(12.0, 3);
		 t1.add(4, 5.0);
		 t1.add(3 , 7);
		 t1.add(4, 5, 6);
		 t1.add(12,2,0,12);
		 
	 }
	 
}
