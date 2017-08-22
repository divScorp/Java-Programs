package String;

public class OnlyNumInString {

	public static void checkNum(String s) {
		char[] c=s.toCharArray();
		System.out.print("Number in given String: ");
		for(int i=0;i<c.length;i++) {
			if(c[i]>='0'&&c[i]<='9')
				System.out.print(c[i]+", ");
		}
	}
	public static void main(String[] args) {
		String s = "he9llo w2o5r7ld";
		checkNum(s);
	}
}
