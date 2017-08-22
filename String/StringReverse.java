package String;

import java.util.Scanner;
public class StringReverse {

	public static String reverse(String str) {
		StringBuilder rev = new StringBuilder("");
		if(str==null)return null;
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s=sc.nextLine();
		System.out.println("Result: " + reverse(s));
		sc.close();
	}

}
