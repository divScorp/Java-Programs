import java.util.Scanner;
class conTrick{
    
   public static void main(String args[]){
       
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     
     System.out.println("Decimal to binary: \t"+Integer.toBinaryString(num));
     System.out.println("Decimal to Hexadecimal: "+Integer.toHexString(num));
     System.out.println("Decimal to octal: \t "+Integer.toOctalString(num));
     input.close();
  }
}
