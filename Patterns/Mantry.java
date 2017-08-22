package Patterns;

public class Mantry {

	static void patternPrint(int n) {
		int c=1;
		for(int i=0;i<n;i++)
			System.out.print(n);
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n/2) {
					System.out.print(c++);
				}else {
					System.out.print(n);
				}
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		patternPrint(5);
	}

}
