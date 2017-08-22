package Bit_Manipulation;

import java.util.Scanner;

public class powerOfTwo {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int x=sc.nextInt();
		
		if(isPowerOfTwo(x)){
			System.out.println("Power of two!");
			
		}else{
			System.out.println("Not a power of two!!");
		}
		sc.close();
	}
	static boolean isPowerOfTwo(int n){
		return (n>0)&&((n&(n-1))==0);
	}
	

}
