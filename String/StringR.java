import java.util.Scanner;
/*
	Input:  This is my country
	Output: sihT is ym country 
*/
public class StringR {

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

	public static String reverse(String str) {
		StringBuilder rev = new StringBuilder("");
		if(str==null)return null;
		for(int i=str.length()-1;i>=0;i--) {
			rev.append(str.charAt(i));
		}
		return rev.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		sc.close();
		String temp="";
		String[] words=split(s);
		for(int i=0;i<words.length;i++) {
		      if(i%2 == 0)
			temp+=reverse(words[i])+" ";
		      else
			temp+=words[i]+" ";
		}
		System.out.println(temp);
	}
}
