package String;

public class hollowString {

	public static void main(String[] args) {
		String st1 = "DIVYANSHU";
		int len = st1.length();
		for (int i = len/2+1; i >= 1; i--) {
			for (int j = 1; j <= len; j++) {
				if (j == i || (len+1 - i) == j) {
					System.out.print(st1.charAt(len/2+1 - i));
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
		for (int i = 2; i <= len/2+1; i++) {
			for (int j = 1; j <= len; j++) {
				if (j == i || (len+1 - i) == j) {
					System.out.print(st1.charAt(len/2-1 + i));
				} else {
					System.out.print(' ');
				}
			}
			System.out.println();
		}
	}
}
