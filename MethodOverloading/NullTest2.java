package MethodOverloading;

public class NullTest2 {

	public static void method(Object obj, Object obj1){
		   System.out.println("method with param types - Object, Object");
		 }

		 public static void method(String str, Object obj){
		   System.out.println("method with param types - String, Object");
		 }
/*
 * In this case the compiler can easily pick 'the most specific' as the method having parameter types (String, Object) as
 	the other overloaded method is having its parameter types as (Object, Object) - clearly 'String' is a subclass of 'Object' 
 	and the other parameter is of same type, so the method with parameter types (String, Object) can be picked with ease.
 * 
 * */
		 public static void main(String [] args){
		   method(null, null);
		 }

}
