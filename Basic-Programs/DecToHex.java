import java.util.Scanner;
class DecToHex
{
   public static void main(String args[])
   {
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     int rem;
     String str2="";
     char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
     while(num>0){
       rem=num%16; 
       str2=hex[rem]+str2; 
       num=num/16;
     }
     System.out.println("Decimal to hexadecimal: "+str2);
     input.close();
  }
}
