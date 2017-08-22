package StringPatterns;
/*
 *		P     M
		 R   A 
		  O R  
		   G   
		  O R  
		 R   A 
		P     M 
 **/
public class pattern26 {
	public static void main(String[] args) {

		String str = "PROGRAM";
		int x = str.length();
		char[] chars = new char[x];
		for (int i = 0; i < x; i++) {
			chars[i] = str.charAt(i);
			chars[x - 1 - i] = str.charAt(x - i - 1);
			for (int j = 0; j < x; j++) {
				if (j == i || j == (x - 1 - i)) {
					continue;
				}
				chars[j] = ' ';
			}
			System.out.println(new String(chars));
		}
	}
}
