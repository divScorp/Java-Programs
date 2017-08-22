package MathPrograms;

import MathPrograms.Factorial;
import java.util.Scanner;

public class nCr {
	
	public static double permutation(int n, int r) {
		int a, b, c;
		a = Factorial.fact(n);
		b = Factorial.fact(r);
		c = Factorial.fact(n - r);
		return (double) a / ((double) (b * c));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of 'n': ");
		int n = sc.nextInt();
		System.out.println("Enter the value of 'r': ");
		int r = sc.nextInt();
		double result;
		if (n >= r) {
			result = permutation(n, r);
			System.out.println("nCr of given inputs: " + result);
		} else {
			System.out.println("N should not be greater than R. ");
		}
		sc.close();
	}
}
