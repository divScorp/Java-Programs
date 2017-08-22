package Bit_Manipulation;

import java.util.Scanner;

class BitShift{
    
    public static void main(String[] args){
        
    	Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter a decimal number: ");
    	 int x=sc.nextInt();
        int a=15; //0000 1111
        int b=22; //0001 0101
        int c=24;
        System.out.println("Your numbers "+x+" binary value: "+Integer.toBinaryString(x));
        System.out.println(a+" Binary value: "+Integer.toBinaryString(a));
        System.out.println(b+" Binary value: "+Integer.toBinaryString(b));
        System.out.println(c+" Binary value: "+Integer.toBinaryString(c));
        System.out.println("------------------------------------------");
        int lshift=a<<1;
        System.out.println("left shift Operation : "+lshift+"\t\t Binary value: "+Integer.toBinaryString(lshift));
        
        int rshift=b>>1;
        System.out.println("Right shift Operation : "+rshift+"\t\t Binary value: "+Integer.toBinaryString(rshift));
        
        int zshift=c>>>1;
        System.out.println("Right shift zero fill Operation : "+zshift+"\t Binary value: "+Integer.toBinaryString(zshift));
        
        System.out.println("------------------------------------------");
        int l=x<<1;
        System.out.println("left shift Operation on your number: "+l+"\t\t Binary value: "+Integer.toBinaryString(l));
        int r=x>>1;
        System.out.println("Right shift Operation on your number: "+r+"\t\t Binary value: "+Integer.toBinaryString(r));
        int rz=x>>>1;
        System.out.println("Right shift zero fill Operation on your number: "+rz+"\t\t Binary value: "+Integer.toBinaryString(rz));
        System.out.println("-------------------------------------------");
    
        sc.close();
    }
}