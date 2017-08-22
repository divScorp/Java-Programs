
package Patterns;

import java.util.Scanner;
/*
                    1 
                    2 1 2 
                    3 2 1 2 3 
                    4 3 2 1 2 3 4 
                    5 4 3 2 1 2 3 4 5 
                    6 5 4 3 2 1 2 3 4 5 6 
                    7 6 5 4 3 2 1 2 3 4 5 6 7
*/

/**
 *
 * @author Vidhikara
 */
public class pattern23 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. :");
        int num=sc.nextInt();
        int s=0;
        for(int i=1;i<=num;i++){
            s=i;
            for(int j=1;j<=2*i-1;j++){
                System.out.print(s+" ");
               if(j<i){
                   s--;
               }else{
                   s++;
               }
            }
            System.out.println("");
        }
        sc.close();
    }
    
}
