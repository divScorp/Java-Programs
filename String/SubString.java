import java.util.Scanner;

public class SubString{
 public static void main(String... arg){

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s=sc.nextLine();
	sc.close();
	for(int k=0;k<s.length();k++){
	for(int i=k;i<s.length();i++){
	  for(int j=k; j<=i;j++){
	   System.out.print(s.charAt(j));
	  }
	  System.out.println();
        }
}
}
}
