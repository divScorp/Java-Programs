package String;

import java.util.Scanner;

public class StringSub {

	public static boolean isSubString(String f, String s) {
		for (int i = 0; i <= f.length() - s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (f.charAt(i + j) == s.charAt(j)) {
					if (j == s.length() - 1) {
						return true;
					}
				} else {
					break;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String f = sc.nextLine();
		System.out.println("Enter the SubString: ");
		String s = sc.nextLine();
		if (isSubString(f, s))
			System.out.println("Substring!!");
		else
			System.out.println("Not a Substring!!");
		sc.close();
	}
}
