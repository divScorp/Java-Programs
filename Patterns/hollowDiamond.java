package Patterns;

import java.util.Scanner;

public class hollowDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" How Many Levels? ");
		int n = sc.nextInt();
		
		if((n&1)==0)n++;
		
		//Upper Half Triangle
		for(int i=1;i<(n/2)+1;i++) {
			for(int j=1;j<=n-i;j++) 
				System.out.print("  ");
			
			for(int j=1;j<=(2*i)-1;j++) {
				if((j==1)||(j==(2*i)-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			for(int k=1;k<=n-i;k++)
				System.out.print("  ");
			System.out.println();
				
		}
		
		//Lower Half Triangle
		for(int i=n/2+1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) 
				System.out.print("  ");
			
			for(int j=1;j<=(2*i)-1;j++) {
				if((j==1)||(j==(2*i)-1))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			for(int k=1;k<=n-i;k++)
				System.out.print("  ");
			System.out.println();
				
		}
		
		sc.close();

		
	}

}
