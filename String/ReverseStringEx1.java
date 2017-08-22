package String;

public class ReverseStringEx1 {

	public static String revLastAndFirst(String s) {
		String[] words=s.split(" ");
		for(String n:words)
			System.out.println(n);
        StringBuilder b = new StringBuilder("");
        for(int i=0;i<words.length;i++) {
        	char[] c=words[i].toCharArray();
      		char temp =c[0];
       		c[0]=c[c.length-1];
       		c[c.length-1]=temp;
        	words[i]=new String(c);
        }
        for(int k=0; k<words.length;k++) {
        	b.append(words[k]);
            b.append(" ");
        }
        
        return b.toString();
	}
	
	public static void main(String[] args) {
		String s="Java is easy";
		System.out.println("Result: " + revLastAndFirst(s));

	}

}
