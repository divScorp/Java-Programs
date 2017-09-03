import java.util.Scanner;
/*       I/P - java is easy
   	 o/p - java=2
	       is=1
	       easy=2

*/
public class CountVowel{
	public static String[] split(String s){
	  int c = 0;
	  for (int i=0;i<s.length();i++){
	  if(s.charAt(i)==' '){
		 c+=1;
	        }
	  }
	  String[] st=new String[c+1];
	  String t="";
	  int j=0;
	  for (int i=0;i<s.length();i++){
	    if(s.charAt(i)!=' '){
	     t += s.charAt(i);
	    }else{
	     st[j++] = t;
	     t = "";
	    }
	  }
	  st[j]=t;
	  return st;
	}
	public static void main(String[] arg){
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the String: ");
	  String s = sc.nextLine();
	  String vow="aeiou";
	  String[] words=split(s);
	  String t="";
	  int c=0;
	  for(int i=0;i<words.length;i++){
		t+=words[i];
	    for(int k=0;k<t.length();k++){
	     for(int j=0;j<vow.length();j++){
		if(t.charAt(k)==vow.charAt(j)){
		     c++;
	  	}
	     }
	    }
	   System.out.println(t+"="+c);
	   t=""; c=0;
	}
  }
}	
	     
	     
