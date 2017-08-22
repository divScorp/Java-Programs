package MathPrograms;

import java.util.Scanner;

public class Factorial {

	//Recursive Factorial
	public static int fact(int n) {
		if(n<1) return 1;
		return n*fact(n-1);
	}
	//Non-recursive Factorial
	public static int nonRfact(int n) {
		int f=1;
		while(n!=0)
			f=f*n--;
		return f;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int t = sc.nextInt();
		int result=fact(t);
		System.out.println("Factorial of number: "+result);
		sc.close();
	}

}
