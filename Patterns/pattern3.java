package Patterns;
/*
                    * * * * * * * 
                    *           * 
                    *           * 
                    *           * 
                    *           * 
                    *           * 
                    * * * * * * *
*/
import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){                
                if(i==1||i==n||j==1||j==n) {
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
