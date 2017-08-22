import java.util.Scanner;

/**
 *
 * @author Vidhikara
 */
public class checkPrime {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        if(n<2){
            System.out.println("Not a prime!! ");
            scn.close();
                return;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not a prime!! ");
                scn.close();
                return;
            }
        }
        
       System.out.println("Number is Prime!! ");
       scn.close();
    }
    
}
