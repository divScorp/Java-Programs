package Bit_Manipulation;

import java.util.Scanner;

public class upperToLower {
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the UpperCase Character: ");
		char ch=sc.next(".").charAt(0);   //it will take only one character(Strict)
		int n=(int)ch;
		n=(n|' ');
		System.out.println("Your char '"+ch+"' in Lowercase : "+(char)n);		
		sc.close();	
	}
}
