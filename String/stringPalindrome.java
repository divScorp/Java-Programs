package String;

import java.io.*;

public class stringPalindrome {

	public static boolean isPalindrome(String s) {
		int len = s.length();
		if (s.length() == 0)
			return false;
		for (int i = 0; i < (len / 2); i++) {
			if (s.charAt(i) != s.charAt(len - 1 - i))
				return false;
		}
		return true;
	}

	public static void main(String args[]) throws Exception { // BufferReader Always throw Exception
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		// String result=(!isPalindrome(str))?"not palindrome!!":"palindrome!!";
		// System.out.print("String is "+result);
		// the above Statement is correct but we are creating Unnecessary Object
		// which is bad in term of memory space as well as time.
		if (!isPalindrome(str))
			System.out.print("String is not palindrome!");
		else
			System.out.print("String is palindrome!");
	}
}