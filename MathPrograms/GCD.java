package MathPrograms;

import java.util.Scanner;

// Greatest Common Divisor
public class GCD {
	// minimum of two numbers
	public static int min(int a, int b) {
		return a < b ? a : b;
	}

	// GCD calculation
	public static int gcdCalculate(int x, int y) {
		int m = min(x, y), gcd = 1; // because 1 is common divisor for any number
		for (int i = m; i > 0; --i) {
			if (x % i == 0 && y % i == 0) {
				gcd = i;
				break;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number : ");
		int first = sc.nextInt();
		System.out.print("Enter the Second number : ");
		int second = sc.nextInt();
		long result = gcdCalculate(first, second);
		System.out.println("GCD of Number " + first + " And " + second + " = " + result);
		sc.close();

	}

}
