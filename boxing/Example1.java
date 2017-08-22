package boxing;

//In Java, values from -128 to 127 are cached, 
//so the same objects are returned. 
//The implementation of valueOf() uses cached 
//objects if the value is between -128 to 127.

public class Example1 {
	
	public static String compareWc(Integer x,Integer y){
		return (x==y)?"Same":"Not same";
	}

	public static void main(String[] args) {
		Integer x = 40, y = 40;
		Integer a=400, b=400;
		Integer m=new Integer(40);
		Integer n=new Integer(40);
		System.out.println("40 , 40 Interger are: "+compareWc(x, y));
		System.out.println("400 , 400 Interger are: "+compareWc(a, b));
		System.out.println("40 , 40 Interger on explicit object creation : "+compareWc(m, n));
	}
}
