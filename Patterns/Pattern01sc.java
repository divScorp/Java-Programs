package Patterns;

import java.util.Scanner;
/*
 *      1 
		0 1 
		1 0 1 
		0 1 0 1 
		1 0 1 0 1 
		0 1 0 1 0 1 
		1 0 1 0 1 0 1 
 * 
 */
public class Pattern01sc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many rows you want in this pattern?");
		int rows = sc.nextInt();
		String str = "";
		for (int i = 1; i <= rows; i++) {
		    str = (i % 2) + " " + str;  
		    System.out.println(str);    
		}
		sc.close();
	}	 
}
