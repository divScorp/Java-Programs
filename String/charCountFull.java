package String;

import java.util.Scanner;

public class charCountFull {

	public static int countChar(String s, char c) {
		int count = 0;
		char[] ct = s.toCharArray();
		int len = ct.length;
		for (int i = 0; i < len; i++) {
			if (c == ct[i])
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println("Number of Characters in String: " + countChar(str, ch));
		sc.close();
	}
}
