import java.util.Scanner;

public class CountChar{
 public static void main(String... arg){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String: ");
	String s=sc.nextLine();
	sc.close();
	int count=0;
	char res=' ';
	String x="";
	char[] c=s.toCharArray();
	for(int j=0;j<s.length();j++){
	for(int i=0;i<c.length;i++){
	     res=s.charAt(j);
             if(c[i]!='0' && c[i]==res){
		count++;
		c[i]='0';
	     }
	  }
         if(count!=0){
          System.out.println(res+" - "+count);
	  count=0;
	}
	 else
	  count=0;
	}
}
}
	  
