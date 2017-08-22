package String;
import java.util.Scanner;

public class OcurrenceOfLetter {
	public static void letterOccurence(String s) {	
		int n;  char c;
		while((s.length()-1)>=0) {
			c=s.charAt(0);
			n=s.length()-s.replace(c+"","").length();
			System.out.println("Occurence of ["+c+"] = "+n);
			s=s.replace(c+"", "");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String str = sc.nextLine();
		letterOccurence(str);
		sc.close();
	}

}
