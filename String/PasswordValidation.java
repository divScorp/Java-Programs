package String;

import java.util.Scanner;

public class PasswordValidation {
	static final String SPECIAL_CHARACTERS = "!,#,$,%,^,&,*,|";
	static String password;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Password: ");
		password = sc.nextLine();
		sc.close();

		if (isValidPassword(password)) {
			System.out.println("Password is in correct format!");
		} else {
			System.out.println("Not a valid password!");
		}
	}

	public static boolean isValidPassword(String pass) {
		boolean loCase = false;
		int isDigit = 0;
		boolean spChar= false;

		if (pass.length() < 8) {
			return false;
		} else {
			for (int i = 0; i < pass.length(); i++) {
				if (pass.matches(".+[a-z].+")) {
					loCase = true;
				}
				if (pass.matches(".+[1-9].+")) {
					isDigit++;
				}
				if (SPECIAL_CHARACTERS.contains(pass.substring(i, i+1))) {
					spChar=true;
				}
			}
		}
		return loCase && (isDigit >= 2) && !spChar;
	}
}
