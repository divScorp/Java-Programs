
import java.util.Scanner;

/*
 *  Sieve of Eratosthenes
 *  A quick method to calculate prime numbers.
 *
 * @author Divyanshu Sharma
 */

public class fast_prime {

   public static void main(String[] args) {
       
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int num = in.nextInt();
    fast_prime get = new fast_prime();
    get.no_of_Prime(num);
    in.close();
    }

   void no_of_Prime(int num) {
        boolean[] pri = new boolean[num+1];
        
        for(int i=2; i<=num; i++){
            pri[i] = true;          //Assume that all are prime
        }
                
        for(int divisor = 2; divisor*divisor<=num; divisor++){//condition checks that multiple of p
            
            // If prime[p] is not changed, then it is a prime
             if(pri[divisor] == true){
                 // update all multiple of divisor
                 for(int i=divisor*2; i<=num; i+=divisor){
                     pri[i] = false;  //Make all multiple false
                 }
             }
        }
        // print the left true element from pri array
        for(int i=2; i<=num; i++){
            if(pri[i]==true){
                System.out.print(" " + i);
            }
        }        
    }    
}
