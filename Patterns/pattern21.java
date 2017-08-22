package Patterns;

import java.util.*;
 /*
                        1234567
                         234567
                          34567
                           4567
                            567
                             67
                              7
                             67
                            567
                           4567
                          34567
                         234567
                        1234567
*/
public class pattern21
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rows you want in this pattern?");
        int rows = sc.nextInt();
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows; i++){
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++){ 
                System.out.print(j); 
            }              
            System.out.println(); 
        } 
        for (int i = rows-1; i >= 1; i--){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
            }
            for (int j = i; j <= rows; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
