package Patterns;
/*
                        * * * * * * *  
                         * * * * * *  
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
public class pattern13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        input.close();
    }
    
}
