package String;
/*
	An anagram of a string is another string that contains same characters,
	only the order of characters can be different. 
	for example -
	"Mother in law" and "Hitler Woman" are anagram.
	
*/
import java.util.Scanner;

public class Anagram {
	public static String lowerCase(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] -= 32;
			}
		}
		return new String(c);
	}

	public static String removeSpace(String s) {
		String t = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				t += s.charAt(i);
		}
		return t;
	}

	public static String sort(String s) {
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length - 1; i++)
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
		return new String(c);
	}

	public static boolean checkAnagram(String f, String s) {
		String s1 = removeSpace(f);
		String s2 = removeSpace(s);
		if (s1.length() != s2.length()) {
			return false;
		}
		s1 = sort(s1);
		s2 = sort(s2);
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two String: ");
		String first = sc.nextLine();
		String second = sc.nextLine();
		if(checkAnagram(lowerCase(first), lowerCase(second))){
			System.out.println(" Strings are anagram!! ");
		}else {
			System.out.println(" Strings is not anagram!! ");
		}
				
		sc.close();
	}
}
