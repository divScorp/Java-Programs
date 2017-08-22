package Patterns;

/*
                        *  
                        * *  
                        * * *  
                        * * * *  
                        * * * * *  
                        * * * *  
                        * * *  
                        * *  
                        *

*/

import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class pattern18 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        //int x=n*2;
        if(n%2==0){
            n++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
                if(i==j||(i+j)==n-1) break;
            }
            System.out.println(" ");
            
        }
        input.close();
    }
    
}
