package Bit_Manipulation;

import java.util.Scanner;

public class countNumOfOne {
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		System.out.print("The Number of one's in : "+num+" ("+Integer.toBinaryString(num)+")");
		int result=countOne(num);
		System.out.println(" is :  "+result);		
		sc.close();
	}
	static int countOne(int n){
		int count=0;
		while(n>0){
			n=n&(n-1);
			count++;
		}
		return count;
	}
}
