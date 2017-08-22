package String;

import java.util.Scanner;

public class AnagramSt {
	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		permutation(str);
		sc.close();
}
}