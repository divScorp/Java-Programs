package MathPrograms;

import MathPrograms.GCDEuclid;
import trick.FastReader;

public class LCM {

	public static void main(String[] args) {
		FastReader sc=new FastReader();
		System.out.println("Enter the number: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int hcf=GCDEuclid.gcd(a, b);
		int lcm=(a*b)/hcf;
		System.out.println("LCM of ("+a+", "+b+") = "+lcm);
	}
}
