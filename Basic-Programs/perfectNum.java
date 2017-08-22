
import java.util.Scanner;
/**
 *
 * @author Vidhikara
 */
public class perfectNum{

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. - ");
        long n=in.nextInt();
       long sum=0;
       for(int i=1;i<=n/2;i++){
           if(n%i==0){
               sum+=i;
           }
       }
       if(n==sum){
            System.out.println("Perfect");
        }else{
            System.out.println("Not Perfect");
        }
       in.close();
    }
    
}
