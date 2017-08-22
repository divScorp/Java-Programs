package exceptionHandling;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int a;
		try {
			a=sc.nextInt();
		}catch(Exception e) {
			System.out.println("Invalid Number!");
			a=0;
		}
		System.out.println("Value of a: "+a);
		sc.close();
	}
}
