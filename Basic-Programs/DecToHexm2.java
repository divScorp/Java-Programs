import java.util.Scanner;
class DecToHexm2
{
   public static void main(String args[])
   {
     Scanner input = new Scanner( System.in );
     System.out.print("Enter a decimal number : ");
     int num =input.nextInt();
     int rem,base=16;
     String digits="0123456789ABCDEF";
     String hex="";
     
     while(num>0){
       rem=num%base; 
       hex=digits.charAt(rem)+hex; 
       num=num/base;
     }
     System.out.println("Decimal to hexadecimal: "+hex);
       System.out.println("---------------------------------");
       System.out.print("Enter a HEX number : ");
       String hexa=input.next();
       System.out.println("Decimal Number of '"+hexa+"' is : "+hex2Dec(hexa)); 
       System.out.println("---------------------------------");
       input.close();
       
  }
   public static int hex2Dec(String s){
       String digits="0123456789ABCDEF";
       int dec=0;
       s=s.toUpperCase();
       for(int i=0;i<s.length();i++){
           char c=s.charAt(i);
           int d=digits.indexOf(c);
           dec=16*dec+d;
       }
       return dec;
   }
}
