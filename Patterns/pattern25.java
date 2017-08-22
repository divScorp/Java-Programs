package Patterns;

import java.util.Scanner;

/*
				*           * 
				* *       * * 
				* * *   * * * 
				* * * * * * * 
				* * *   * * * 
				* *       * * 
				*           *
 * 
 * */

public class pattern25 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the no: ");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i + j<=n+1 ) && (i >= j)) || ((i + j >= n+1) && (i <= j))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		scn.close();
	}
}