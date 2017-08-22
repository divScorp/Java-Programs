package Patterns;

import java.util.Scanner;

class pattern24 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int space = (n * 2) + 1;
		int c = 1;
		for (int i = 1; c <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j < i; j++) {
					System.out.println("*");
				}
				for (int s = space; s >= 1; s--) {
					if (c == n && s == 1)
						break;

					System.out.println(" ");
				}
				for (int k = 1; k <= i; k++) {
					if (c == n && k == n + 1)
						break;

					System.out.println("*");
				}
				System.out.println("");
				space -= n;
				++c;
			}
		}
		scn.close();
	}
}

