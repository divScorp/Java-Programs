package Patterns;
/*
                    1  
                    2 3  
                    4 5 6  
                    7 8 9 10  

*/
import java.util.Scanner;
public class pattern8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        int s=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(s+" ");
                s++;
            }
            System.out.println("");
        }
        input.close();
    }
    
}
