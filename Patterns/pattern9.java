package Patterns;

/*
                            *                 
                            * * 
                            *   * 
                            *     * 
                            *       * 
                            *         * 
                            *           * 
                            *             * 
                            * * * * * * * * * 
*/

import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class pattern9 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){                 
                if(j==1||i==n){
                    System.out.print("* ");                    
                }else if(i==j){
                    System.out.print("* ");
                    break;                   
                } else{
                     System.out.print("  ");
                }
                    
                
            }
            System.out.println("");
        }
        input.close();
    }
    
}
