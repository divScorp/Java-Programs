package MathPrograms;

import java.util.Scanner;

/*
 * if x pow(n) then x(2)(n/2) 
 * if x pow(n) then x(2)(n-1/2)
 * 	 
 * */
public class PowerOfX {

	public static long xPowN(int x, int n) {
		int result = 1;
		while (n > 0) {
			if (n % 2 == 1)
				result = result * x;
			x = x * x;
			n = n / 2;
		}
		return result;
	}
	
	/* To compute power of multiple numbers...! 2 pow(10 pow(9))
	 *  
	 * int modularExponentiation(int x,int n,int M)
	{
	    int result=1;   
	    while(n>0)
	    {
	        if(n % 2 ==1)
	            result=(result * x)%M;
	        x=(x*x)%M;
	        n=n/2;
	    }
	    return result;
	}*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of x: ");
		int x = sc.nextInt();
		System.out.print("Enter the power of x: ");
		int n = sc.nextInt();
		long result = xPowN(x, n);
		System.out.println(x + " Power " + n + " = " + result);
		sc.close();
	}
}
