package Patterns;

import java.util.Scanner;
/*
			  	        *  
			          * *  
			        * * *  
			      * * * *  
			    * * * * *  
			  * * * * * *  
			* * * * * * *  
			  * * * * * *  
			    * * * * *  
			      * * * *  
			        * * *  
			          * *  
			            *  

 * */

public class halfDiamond {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no.of stars: ");
		int n = input.nextInt();
		int spaces=n-1;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <=spaces; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = i; j >=spaces; j--) {
				System.out.print("  ");
				
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			spaces=spaces-2;
			System.out.println(" ");
		}
		input.close();
	}

}
