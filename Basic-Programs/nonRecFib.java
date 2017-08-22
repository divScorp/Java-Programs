
import java.util.Scanner;

/**
 * Non-recursive fibonaci series
 * @author Vidhikara
 */
public class nonRecFib {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f1=0,f2=1,f3=1;
        System.out.println(f1);
        System.out.println(" "+f2);
        for(int i=0;i<=n-2;i++){
            f3=f1+f2;
            System.out.println(" "+f3);
            f1=f2;
            f2=f3;            
        }
        sc.close();
    }
    
}
