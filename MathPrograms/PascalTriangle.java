package MathPrograms;

import java.util.Scanner;

public class PascalTriangle {

	public static void pascal(int n) {
		
	}
	
	public static void main(String[] args){
		
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the length of pascal triangle: ");
		int n=sc.nextInt();
//		pascal(len);
		for(int i=1;i<=n;i++) {
			int c=0;
			for(int spaces=1;spaces<=n-i+1;spaces++)
				System.out.println(" ");
			int k=i;
			for(int j=1;j>=1;) {
				System.out.println(j+" ");
				if(j==k) {
					j--; k=j;
					c=1;
				}
				if(c==0)
					j++;
			}
			System.out.print("\n");
		}
		sc.close();

	}

}
