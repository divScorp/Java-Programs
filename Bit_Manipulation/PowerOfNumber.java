package Bit_Manipulation;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the Number: ");
//		int n=sc.nextInt();
		System.out.print("Upto: ");
		int x=sc.nextInt();
		for(int i=0;i<=x;i++){
			int t=2<<i;
			System.out.print(t+" ");
		}
		sc.close();
	}
}
