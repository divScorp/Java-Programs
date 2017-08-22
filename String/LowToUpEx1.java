package String;

// Java to jAVA

public class LowToUpEx1 {

	public static String convert(String s) {
		char[] c=s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(c[i]>='a'&&c[i]<='z') {
				c[i]-=32;
			}else {
				c[i]+=32;
			}
		}
		return new String(c);
	}
	public static void main(String[] args) {
		String s="Java";
		System.out.print("After Conversion: "+convert(s));

	}

}
