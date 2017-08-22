package Bit_Manipulation;

import java.util.Scanner;

public class checkBitSet {
	
	public static void main(String... args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num=sc.nextInt();
		System.out.print("Position to check: ");
		int pos=sc.nextInt();
		System.out.println("Your number is: "+Integer.toBinaryString(num));
		if(!checkBit(num,pos)){
			System.out.println("The "+pos+" bit is set(or 1). ");
		}else{
			System.out.println("The "+pos+" bit is not set(or 0).");
		}
		sc.close();		
	}
	static boolean checkBit(int n,int p){
		boolean res=((n&(1<<p))==0)?true:false;
		return res;
	}

}
