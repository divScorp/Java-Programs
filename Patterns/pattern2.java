package Patterns;
/*
                    *_ *_ *_ *_
                     *_ *_ *_ 
                    *_ *_ *_ *_
                     *_ *_ *_ 
                    *_ *_ *_ *_
                     *_ *_ *_ 
                    *_ *_ *_ *_
*/
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                
                if((i+j)%2==0) System.out.print("*_");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
        input.close();
    }
    
}
