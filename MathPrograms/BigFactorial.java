package MathPrograms;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		BigInteger b=new BigInteger("1");
		for(int i=1;i<=n;i++) {
			b=b.multiply(BigInteger.valueOf(i));
		}
		System.out.println("Factorial of a Number: "+b);
		sc.close();		
	}
}
