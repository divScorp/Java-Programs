package Patterns;

import java.util.Scanner;

public class flagPattern {

	 public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        System.out.println("Enter the no.of stars: ");
	        int n = input.nextInt();
	        int point=n/2;
	        for(int i=1;i<=n;i++){
	            for(int j=1;j<=n;j++){                
	                if(i==1||i==point||j==1||j==n && i<=point) {
	                    System.out.print("* ");
	                }
	                else{
	                    System.out.print("  ");
	                }                 
	            }            
	            System.out.println("");
	        }
	        input.close();
	    }
}
