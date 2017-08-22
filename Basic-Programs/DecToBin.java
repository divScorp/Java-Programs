
import java.util.Scanner;

public class DecToBin {

   public static String toBinary(int n) {
       if (n == 0) {
           return "0";
       }
       String binary = "";
       while (n > 0) {
           int rem = n % 2;
           binary = rem + binary;
           n = n / 2;
       }
       return binary;
   }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int decimal = sc.nextInt();
       String binary = DecToBin.toBinary(decimal);
       System.out.println("The binary representation is " + binary);
       sc.close();
   }
}