package String;

import java.util.Scanner;

public class ExchangeAlter {
	public static String[] split(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				c += 1;
			}
		}
		String[] st = new String[c + 1];
		String t = "";
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				t += s.charAt(i);
			} else {
				st[j++] = t;
				t = "";
			}
		}
		st[j] = t;
		return st;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		String[] str = split(s);
		String temp = "";
		temp = str[0];
		str[0] = str[str.length - 1];
		str[str.length - 1] = temp;
		for (String s1 : str) {
			System.out.print(s1 + " ");
		}
	}
}
