package String;

import java.util.Scanner;

public class stringPalindrome2 {

	public static void main(String args[]) throws Exception {
		StringBuffer rev = new StringBuffer();
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			rev.append(str.charAt(i));
		}
		String result = (str.equals(rev.toString())) ? "YES" : "NO";
		System.out.println(result);
		s.close();
	}
}
