package Bit_Manipulation;

import java.util.Scanner;

public class oddEven {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		int x=sc.nextInt();
		if(checkOddEven(x)){
			System.out.println(x+" is a Even Number. ");
		}else{
			System.out.println(x+" is a Odd Number. ");
		}
		sc.close();
	}
	static boolean checkOddEven(int num){
		return ((num & 1)==0);
	}
	
}
