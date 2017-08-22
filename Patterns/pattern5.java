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
public class pattern5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print("* ");
               if(i==j) break;
            }
            System.out.println(" ");
        }
        input.close();
    }
    
}
