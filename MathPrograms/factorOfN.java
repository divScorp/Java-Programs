package MathPrograms;

import java.util.Scanner;

public class factorOfN {
	public static void factor(int n) {
		for(int i=1;i<=n/2;i++) {
			if(n%i==0)
				System.out.println(i+", ");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int t = sc.nextInt();
		factor(t);
		sc.close();
	}

}
