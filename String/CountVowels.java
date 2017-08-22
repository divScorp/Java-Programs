package String;

import java.util.Scanner;

public class CountVowels {
	
	public static int  vowelsCount(String s) {
		int count=0;
		char c;
		int len=s.length()-1;
		s=s.toLowerCase();
		for(int i=0;i<len;i++) {
			c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String: ");
		String str = sc.nextLine();
		System.out.println("Number of Vowels in String: " + vowelsCount(str));
		sc.close();

	}

}
