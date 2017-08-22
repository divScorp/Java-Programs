package Bit_Manipulation;

import java.util.Scanner;

/*
 * Generate possible Subsets for given set.
 * 
 * */

public class subsetOfSet {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		// char ch[]={'a','b','c','d'};
		System.out.print("How many element in set?  ");
		int n = sc.nextInt();
		char[] ch = new char[n];
		System.out.print("Enter the char elements: ");
		for (int k = 0; k < n; k++) {
			char c = sc.next().charAt(0);
			ch[k] = c;
		}
		subsetOfSet.possibleSubset(ch, n);
		sc.close();
	}

	static void possibleSubset(char[] c, int n) {

		for (int i = 0; i < (1 << n); ++i) {// here i loop until it reaches
											// 2powN (1<<n). bcz
											// there are 2powN subset for a set
											// with N element.
			System.out.print("{");
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) != 0) {
					System.out.print(c[j] + " ");
				}
			}
			System.out.print("}, ");
		}
	}

}
