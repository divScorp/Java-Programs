package String;
/*
    Write a program to reverse a string using recursive methods. 
    You should not use any string reverse methods to do this.
*/

public class StringRecursive {

	String reverse = "";
	public String reverseString(String str) {
		if (str.length() == 1) {
			return str;
		} else {
			reverse += str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
			return reverse;
		}
	}

	public static void main(String a[]) {
		StringRecursive srr = new StringRecursive();
		System.out.println("Result: " + srr.reverseString("HELLO BRO!"));
	}
}