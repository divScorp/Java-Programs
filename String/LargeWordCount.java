package String;

public class LargeWordCount {

	public static String[] split(String s) {
		int c = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				c++;
		}
		String[] temp = new String[c + 1];
		String t = "";
		int i=0;
		for (int j = 0; j < s.length(); j++) {
			if (s.charAt(j) != ' ') {
				t += s.charAt(j);
			} else {
				temp[i++] = t;
				t = "";
			}
		}
		temp[i] = t;
		return temp;
	}
	public static void sort(String[] s) {
		for(int j=0;j<s.length;j++) {
			for(int i=0;i<s.length-(j+1);i++) {
				if(s[i].length()>s[i+1].length()) {
					String t=s[i];
					s[i]=s[i+1];
					s[i+1]=t;
				}
			}
		}
	}
	public static String sortAndCount(String[] sp) {
		sort(sp);
		String sx="";
		int n;
		for(int k=0;k<sp.length-1;k++) {
			if(sp[k].length()!=sp[k+1].length()) {
				n=sp[k].length();
				sx+=sp[k]+n+" ";
			}else {
				sx+=sp[k]+" ";
			}
		}
		sx+=sp[sp.length-1]+sp[sp.length-1].length();
		return sx;
	}
	public static void main(String[] args) {
		String s = "the white tiger is bigger than the brown tiger";
		// output : is 2 the 3 than 4 white tiger brown 5 bigger 6
		String[] sp=split(s);
		for(String n:sp) {
			System.out.print(n+" ");
		}	
		System.out.println();
		String res=sortAndCount(sp);
		System.out.println(res);

	}
}
