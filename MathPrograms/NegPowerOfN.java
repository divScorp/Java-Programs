package MathPrograms;

import java.util.Scanner;

public class NegPowerOfN {

	public static double PowerOfX(int num, int pow) {
		double res = 1;
		if (pow > 0) {
			for (int i = 0; i < pow; i++)
				res = res * num;
		} else {
			for (int i = 0; i < (-pow); i++)
				res = res / num;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the power of x: ");
		int n = sc.nextInt();
		double result = PowerOfX(x, n);
		System.out.println(x + " Power " + n + " = " + result);
		sc.close();

	}

}
