package Patterns;

import java.util.Scanner;
/*
					 	  * 
					    *   * 
					  *       * 
					* * * * * * * 
					*           * 
					*           * 
					*           * 
					*           * 
					*           * 
					* * * * * * * 
 * */
public class templePattern {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no.of stars: ");
		int n = input.nextInt();
		int point = n / 2;
		for (int i = 1; i <= point; i++) {
			for(int j=i; j<=point; j++)
	        {
				System.out.print("  ");
	        }
			for(int j=1; j<=(2*i-1); j++)
	        {
	            if(j==1 || j==(2*i-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {

				if (i == 1 || i == n || j == 1 || j == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		input.close();
	}
}
