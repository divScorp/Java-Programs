package MathPrograms;

import java.util.Scanner;

public class SeriesSum {

	public static int sum(int n) {
		return ((n*(n+1))/2);
	}
	public static int sumSquare(int n) {
		return ((n*(n+1)*(2*n+1))/6);
	}
	public static int sumCubes(int n) {
		return ((n*n*(n+1)*(n+1))/4);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a=sc.nextInt();
		System.out.println("Sum of Series: "+sum(a));
		System.out.println("Sum of Square of the Series: "+sumSquare(a));
		System.out.println("Sum of Cubes of the Series: "+sumCubes(a));
		sc.close();
	}
}
