package String;

import java.util.Scanner;

public class Colindrome {
	public static String[] split(String s) {
		String t = "";
		String r[] = new String[(s.length() / 6)];
		for (int i = 0; i < s.length() / 6;) {
			for (int j = 0; j < s.length(); j++) {
				if ((j + 1) % 6 == 0) {
					t += s.charAt(j);
					r[i++] = t;
					t = "";
				} else
					t += s.charAt(j);
			}
		}
		for (String x : r) {
			System.out.println(x);
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		int flag = 0;
		if (s.length() < 6 && (s.length() % 6 != 0))
			System.out.println("Not a colindrome!");
		String[] res = split(s);
		for (int i = 0; i < res.length; i++) {
			if (!isColindrome(res[i]))
				flag = 1;
		}
		if (flag == 0) {
			System.out.println("String is colindrome");
		} else {
			System.out.println("Not a colindrome!");
		}

	}

	public static boolean isColindrome(String s) {
		int k = 2, j = 3;
		while (k > 0) {
			if (s.charAt(k) != s.charAt(j))
				return false;
			k--;
			j++;
		}
		return true;
	}
}
