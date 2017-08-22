package Patterns;


/*
						**********
						****  ****
						***    ***
						**      **
						*        *
						*        *
						**      **
						***    ***
						****  ****
						**********

 * 
 * */
public class Pattern28 {
	public static void main(String args[]) {
		int space = 0;
		for (int i = 5; i >= 1; i--) {
			for (int j = i; j >= 1; j--)
				System.out.print("*");
			for (int j = 1; j <= space; j++)
				System.out.print(" ");
			for (int j = i; j >= 1; j--)
				System.out.print("*");
			System.out.println();
			space = space + 2;
		}
		space = 8;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			for (int j = 1; j <= space; j++)
				System.out.print(" ");
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
			space = space - 2;
		}
	}
}
