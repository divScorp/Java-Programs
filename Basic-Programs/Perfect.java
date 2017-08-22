
import java.util.Scanner;

/*
        perfect Number between 1-N
*/
public class Perfect {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. - ");
        long n=in.nextInt();
        int i;
        for(i = 2; i < n; i++) {              
            if(isNumPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
        in.close();
    }
    public static boolean isNumPerfect(int i) {
        boolean isPerfect = false;
        int sum = 1;
        int x;
        for(x = 2; x <= i / 2; x++) {
            if(i % x == 0) {
                sum += x;
            }
        }
        if(sum == i) {
            isPerfect = true;
        }
        return isPerfect;
    }
}