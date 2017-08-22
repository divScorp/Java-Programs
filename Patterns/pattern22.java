package Patterns;

import java.util.Scanner;
/*
                    1 
                    2 8 
                    3 9 14 
                    4 10 15 19 
                    5 11 16 20 23 
                    6 12 17 21 24 26 
                    7 13 18 22 25 27 28 
*/

/*
 * @author Vidhikara
 */
public class pattern22 {
        public static void main(String args[]){
            
           Scanner sc =new Scanner(System.in);
            System.out.println("Enter the no. :");
            int i,j,k;
            int rows=sc.nextInt();
            for( i=1;i<=rows;i++){
                k=i;
                for(j=1;j<=i;j++){
                    System.out.print(k+" ");
                    k=k+rows-j;
                }
            System.out.println();
        }
            sc.close();
    }
}
