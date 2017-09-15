package String;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
	
	public static void sortByLength(String[] s) {
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length()-s2.length();
			}
		});
	}
	
	public static void sortByAlphabet(String[] s) {
		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.charAt(0)<s2.charAt(0))
					return -1;
				return 1;
			}
		});
		
	}
	public static void print(String[] s) {
		for(String str:s) {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		String[] s={"java","html","python","swift","android"};
		sortByLength(s);
		System.out.println("Sort by length: ");
		print(s);
		sortByAlphabet(s);
		System.out.println("\nSort by alphabet: ");
		print(s);
	}

}
