package String;

import java.util.Scanner;

public class charCount {

	public static int countChar(String s, char c) {
		return s.length() - s.replace(c + "", "").length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch = sc.next().charAt(0);
		System.out.println("Number of Characters in String: " + countChar(str, ch));
		sc.close();
	}
}
