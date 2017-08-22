package MathPrograms;

import java.util.Scanner;

public class MyBigFactorial {

	public static int[] fact(int n) {
	    int[] r = new int[100];
	    r[0] = 1;
	    for (int i = 1; i <= n; ++i) {
	        int carry = 0;
	        for (int j = 0; j < r.length; j++) {
	            int x = r[j] * i + carry;
	            r[j] = x % 10;
	            carry = x / 10;
	        }
	    }
	    return r;
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int[] result = fact(n);
		int i = result.length - 1;
		while (i > 0 && result[i] == 0)
		    --i;
		while (i >= 0)
		    System.out.print(result[i--]);
		System.out.println();
		sc.close();
	}

}
