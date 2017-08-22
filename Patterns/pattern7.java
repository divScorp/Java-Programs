package Patterns;
/*
                    1  
                    1 2  
                    1 2 3  
                    1 2 3 4  
                    1 2 3 4 5  
                    1 2 3 4 5 6  
                    1 2 3 4 5 6 7 
*/
import java.util.Scanner;
public class pattern7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no.of stars: ");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(j+" ");//j prints
                if(i==j) break;
            }
            System.out.println(" ");
        }
        input.close();
    }
    
}
