package MathPrograms;

import java.util.Scanner;

//Euclid's Algorithm to calculate GCD of two numbers

public class GCDEuclid {

	public static int gcd(int x, int y) {
		int max,min;
		if(x<y) {
			max=y;min=x;
		}else{
			min=y;max=x;
		}
	 
		return (min == 0)?max:gcd(min, max % min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int first = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int second = sc.nextInt();
		int result = gcd(first, second);
		System.out.println("GCD of Number " + first + " And " + second + " = " + result);
		sc.close();

	}

}
