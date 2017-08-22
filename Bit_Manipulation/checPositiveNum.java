package Bit_Manipulation;

import java.util.Scanner;

public class checPositiveNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n = sc.nextInt();
		if (n >> 31 == 0)
			System.out.println("Positive Number!");
		else
			System.out.println("Negative Number!");
		sc.close();
	}
}
