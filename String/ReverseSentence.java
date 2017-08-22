package String;

import java.util.Scanner;

public class ReverseSentence {
	
	public static String reverseSentence(String str) {
		String[] words=str.split(" ");
        StringBuilder revb = new StringBuilder("");
        for(int j = words.length - 1; j >= 0 ; j--)
        {
            revb.append(words[j]);
            revb.append(" ");
        }
        return revb.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Result: " + reverseSentence(s));
		sc.close();
	}

}
