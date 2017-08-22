import java.util.*;
class genRandomNum {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("How many random number you want? "); 
       int n = sc.nextInt();
       System.out.println("Range from which random number you want? "); 
       int range = sc.nextInt();
       
      Random rnum = new Random();
    
      System.out.println("Random Numbers:");
      System.out.println("***************");
      for (int counter = 1; counter <= n; counter++) {
         System.out.println(rnum.nextInt(range));
      }
      System.out.println("***************");
      sc.close();
   }
}