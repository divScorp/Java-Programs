package MethodOverloading;

public class NullTest1 {
	
	/*
	 * If more than one member method is both accessible and applicable to a method invocation, 
	 * it is necessary to choose one to provide the descriptor for the run-time method dispatch.
	 * 
	 * The Java programming language uses the rule that the most specific method is chosen.
	 * */

	public static void method(Object obj){
	     System.out.println("method with param type - Object");
	   }
	 
	   public static void method(String obj){
	     System.out.println("method with param type - String");
	   }
	   
//	   public static void method(StringBuffer strBuf){
//		     System.out.println("method with param type - StringBuffer");
//		   }
	   
	   /*
	    * Why is the compiler not able to pick 'the most specific' here - because both "String" and "StringBuffer" are are sub-classes.
		  of the Object class, but without being in the same inheritance hierarchy. For finding 
		  'the most specific' method, the compiler needs to find a method having the parameter type, 
		  which is a sub-class of the parameter types of all other overloaded methods. 
	    * */
	 
	   public static void main(String [] args){
	     method(null);
	   }
}

