package Patterns;

import java.util.Scanner;
/*
                        1 
                        1 2 1 
                        1 2 3 2 1 
                        1 2 3 4 3 2 1 
                        1 2 3 4 5 4 3 2 1 
                        1 2 3 4 5 6 5 4 3 2 1 
                        1 2 3 4 5 6 7 6 5 4 3 2 1 
*/
/**
 *
 * @author Vidhikara
 */
public class pattern20 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int rows = input.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        input.close();
    }
    
}
