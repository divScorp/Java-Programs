package Bit_Manipulation;

import java.util.Scanner;

public class lowerToUpper {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lowercase Character: ");
		char ch=sc.next(".").charAt(0);   //it will take only one character(Strict)
//		char c=sc.findInLine(".").charAt(0); //it will take first line from the characters
		int n=(int)ch;
		n=(n&'_');
		System.out.println("Your char '"+ch+"' in UpperCase : "+(char)n);
		
		sc.close();
	
	}
}
