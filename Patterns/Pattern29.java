package Patterns;

public class Pattern29 {

	public static void main(String[] args) {
		int nos = 4;
		for (int i = 1; i <= 5; i++) {
			for (int s = nos; s >= 1; s--) {
				System.out.println("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.println("* ");
			}
			for (int k = 1; k <= (i - 1); k++) {
				if (i == 1) {
					continue;
				}
				System.out.println("* ");
			}
			System.out.println();
			nos--;
		}
		nos = 1;
		for (int i = 4; i >= 1; i--) {
			for (int s = nos; s >= 1; s--) {
				System.out.println("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.println("* ");
			}
			for (int k = 1; k <= (i - 1); k++) {
				System.out.println("* ");
			}
			nos++;
			System.out.println();
		}
		nos = 3;
		for (int i = 2; i <= 5; i++) {
			if ((i % 2) != 0) {
				for (int s = nos; s >= 1; s--) {
					System.out.println("  ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.println("* ");
				}
			}
			if ((i % 2) != 0) {
				System.out.println();
				nos--;
			}
		}
	}
}
